package com.igeek.databaseStu;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StuManager {
	private DataUtil d;
	
	public StuManager() throws Exception{
		d=new DataUtil();
	}
	public void findAll() throws Exception{
		String sql="select * from stu";
		Object[] paras={};
		List<Student> results=d.search(sql, paras,Student.class);
		for(Student result:results){
			System.out.println(result.toString());
			
		}
	}
	public void addStu(String sno,String name,int age,int score) throws Exception{
		String sql="insert into stu (sno,name,age,score) values(?,?,?,?)";
		Object[] paras={sno,name,age,score};
		
		if(d.update(sql, paras)){
			System.out.println("��ӳɹ�");
		}else{
		System.out.println("���ʧ��");	
		}
		
		
		
	}
	
	public void deleteStu(String sno) throws Exception{
		 String sql= "delete from stu where sno=?";
		 Object[] paras={sno};
		 if(d.update(sql, paras)){
				System.out.println("ɾ���ɹ�");
			}else{
			System.out.println("ɾ��ʧ��");	
			}
		 
			}
	public void updateStu(String sno,int score) throws Exception{
		String sql="update stu set score=? where sno=?";
		Object[] paras={score,sno};
		if(d.update(sql, paras)){
			System.out.println("���ֳɹ�");
		}else{
		System.out.println("����ʧ��");	
		}
		}
	
	public void search(String sno) throws Exception{
		String sql="select * from stu where sno=?";
		Object[] paras={sno};
		List<Student> results=d.search(sql, paras,Student.class);
		for(Student result:results){
			
			System.out.println(result);
		}
	}
	
	public void pageSearch(int pageNo) throws Exception{
		String sql="select * from stu order by sno limit ?,3";
		Object[] paras={(pageNo-1)*3};
		List<Student> results=d.search(sql, paras,Student.class);
		for(Student result:results){
			
			System.out.println(result);
		}
		
	}
	
	public void psClose() throws Exception{
		
			d.close();
		
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
