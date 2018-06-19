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
			System.out.println("不好意思,目前没有学生信息可供查询,请回去重新选择你的操作");
		return;
		}
		for (int i = 0; i < this.al.size(); i++) {
			System.out.println("学号\t姓名\t年龄\t分数");
			System.out.println(this.al.get(i).getSno()+"\t"+this.al.get(i).getName()+"\t"+this.al.get(i).getAge()+"\t"+this.al.get(i).getScore());
		}
	}
	public void addStu(String sno,String name,int age,int score){
		Student stu=new Student(sno, name,age,score);
		this.al.add(stu);
		System.out.println("添加成功！");
	}
	
	public void deleteStu(String sno){
		for (int i = 0; i < this.al.size(); i++) {
			if(this.al.get(i).getSno().equals(sno)){
				this.al.remove(i);
				System.out.println("删除成功");
				return;
			}
		}
		System.out.println("不好意思,你要删除的学号对应的学生信息不存在,请回去重新你的选择");
	}
	public void updateStu(String sno){
		Scanner sc1=new Scanner(System.in);
		for (int i = 0; i < this.al.size(); i++) {
			if(this.al.get(i).getSno().equals(sno)){
				
				System.out.println("请给学生打分：");
				String score=sc1.next();
				if(!Student.isInteger(score)){
					System.out.println("输入错误，分数必须为数字，请重新输入");
					sc1.close();
					return;
				}
				this.al.get(i).setScore(Integer.parseInt(score));  
				System.out.println("评分成功");
				sc1.close();
				return;
			}
			
		}
		sc1.close();
		System.out.println("不好意思,你要修改的学号对应的学生信息不存在,请回去重新你的选择");
	}
	
	public void search(String sno){
		if(this.al.isEmpty()){
			System.out.println("不好意思,目前没有学生信息可供查询,请回去重新选择你的操作");
		return;
		}
		for (int i = 0; i < this.al.size(); i++) {
			if(this.al.get(i).getSno().equals(sno)){
				System.out.println("学号\t姓名\t年龄\t分数");
				System.out.println(this.al.get(i).getSno()+"\t"+this.al.get(i).getName()+"\t"+this.al.get(i).getAge()+"\t"+this.al.get(i).getScore());
			}
			else{
				System.out.println("您查询的学生不存在");
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
//			System.out.println("未找到文件，请重新输入");
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
