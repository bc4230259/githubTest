package com.igeek.ListStu;


import java.util.ArrayList;
import java.util.Scanner;

public class StuManager {
	private ArrayList<Student> al;
	public StuManager(){
		this.al=new ArrayList<Student>();
	
	}
	public void findAll(){
		if(this.al.isEmpty()){
			System.out.println("������˼,Ŀǰû��ѧ����Ϣ�ɹ���ѯ,���ȥ����ѡ����Ĳ���");
		return;
		}
		for (int i = 0; i < this.al.size(); i++) {
			System.out.println("ѧ��\t����\t����\t����");
			System.out.println(this.al.get(i).getSno()+"\t"+this.al.get(i).getName()+"\t"+this.al.get(i).getAge()+"\t"+this.al.get(i).getScore());
		}
	}
	public void addStu(String sno,String name,int age,int score){
		Student stu=new Student(sno, name,age,score);
		this.al.add(stu);
		System.out.println("��ӳɹ���");
	}
	
	public void deleteStu(String sno){
		for (int i = 0; i < this.al.size(); i++) {
			if(this.al.get(i).getSno().equals(sno)){
				this.al.remove(i);
				System.out.println("ɾ���ɹ�");
				return;
			}
		}
		System.out.println("������˼,��Ҫɾ����ѧ�Ŷ�Ӧ��ѧ����Ϣ������,���ȥ�������ѡ��");
	}
	public void updateStu(String sno){
		Scanner sc1=new Scanner(System.in);
		for (int i = 0; i < this.al.size(); i++) {
			if(this.al.get(i).getSno().equals(sno)){
				
				System.out.println("���ѧ����֣�");
				String score=sc1.next();
				if(!Student.isInteger(score)){
					System.out.println("������󣬷�������Ϊ���֣�����������");
					sc1.close();
					return;
				}
				this.al.get(i).setScore(Integer.parseInt(score));  
				System.out.println("���ֳɹ�");
				sc1.close();
				return;
			}
			
		}
		sc1.close();
		System.out.println("������˼,��Ҫ�޸ĵ�ѧ�Ŷ�Ӧ��ѧ����Ϣ������,���ȥ�������ѡ��");
	}
	
	public void search(String sno){
		if(this.al.isEmpty()){
			System.out.println("������˼,Ŀǰû��ѧ����Ϣ�ɹ���ѯ,���ȥ����ѡ����Ĳ���");
		return;
		}
		for (int i = 0; i < this.al.size(); i++) {
			if(this.al.get(i).getSno().equals(sno)){
				System.out.println("ѧ��\t����\t����\t����");
				System.out.println(this.al.get(i).getSno()+"\t"+this.al.get(i).getName()+"\t"+this.al.get(i).getAge()+"\t"+this.al.get(i).getScore());
			}
			else{
				System.out.println("����ѯ��ѧ��������");
			}
		}
	}
	
	public void pageSearch(){
		
	}
	
//	private void importStu(){
//		try{
//		FileReader fr= new FileReader("Stu.txt");
//		BufferedReader br=new BufferedReader(fr);
//		String receiver="1";
//		while((receiver=br.readLine())!=null){
//			Student stu=new Student(receiver.split(",")[0],receiver.split(",")[1],Integer.parseInt(receiver.split(",")[2]),receiver.split(",")[3]);
//			this.al.add(stu);
//		}
//		fr.close();
//		br.close();
//		}
//		catch(Exception e){
//			System.out.println("δ�ҵ��ļ�������������");
//		}
//	}
	
//	public void ExportStu() throws Exception{
//		FileWriter fw= new FileWriter("Stu.txt");
//		BufferedWriter bw=new BufferedWriter(fw);
//		for (int i = 0; i < this.al.size(); i++) {
//			Student stuTemp=this.al.get(i);
//			String temp=stuTemp.getSno()+","+stuTemp.getName()+","+stuTemp.getAge()+","+stuTemp.getAddress();
//			bw.write(temp);
//			bw.newLine();
//		}
//		bw.flush();
//		bw.close();
//		fw.close();
//		
//	}
	
}
