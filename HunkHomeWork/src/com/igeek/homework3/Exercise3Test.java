package com.igeek.homework3;

import java.util.*;


public class Exercise3Test {

	public static void main(String[] args) {
		// initialize
		List<Stu> stuList=new ArrayList<Stu>();
		Exercise3Test e3=new Exercise3Test();
			stuList.add(new Stu("С��","1��",50));
			stuList.add(new Stu("С��","1��",60));
			stuList.add(new Stu("С��","2��",87));
			stuList.add(new Stu("С��","2��",52));
			stuList.add(new Stu("С��","2��",59));
			stuList.add(new Stu("С��","3��",95));
			stuList.add(new Stu("С��","3��",45));
			stuList.add(new Stu("С��","2��",72));
			stuList.add(new Stu("С��","1��",82));
			stuList.add(new Stu("С��","1��",62));
			stuList.add(new Stu("С��","1��",57));
			stuList.add(new Stu("С��","2��",80));
			stuList.add(new Stu("С��","3��",90));
			
		List<Stu> classOneStus=new ArrayList<Stu>();	
		List<Stu> classTwoStus=new ArrayList<Stu>();
		List<Stu> classThreeStus=new ArrayList<Stu>();
		
		for(Stu stu:stuList){
			if(stu.getClassNumber().equals("1��")){
				classOneStus.add(stu);
			}else if(stu.getClassNumber().equals("2��")){
				classTwoStus.add(stu);
			}else{
				classThreeStus.add(stu);
			}
		}	
		
		ClassRoom cr1=new ClassRoom("�༶1",classOneStus);
		ClassRoom cr2=new ClassRoom("�༶2",classTwoStus);
		ClassRoom cr3=new ClassRoom("�༶3",classThreeStus);
		
		Map<String,ClassRoom> classStuMap=new HashMap<>();
		
		classStuMap.put("1��", cr1);
		classStuMap.put("2��", cr2);
		classStuMap.put("3��", cr3);
		
		for(Map.Entry<String,ClassRoom> classAndStu:classStuMap.entrySet()){
			double[] scores=e3.counting(classAndStu.getValue().getStuList());
			System.out.println(classAndStu.getKey()+"���ܷ�Ϊ:"+scores[0]+"ƽ����Ϊ:"+scores[1]);
		}
		
	}	
	
	public  double[] counting(List<Stu> stuList){
		double totalScore=0D;
		double averageScore=0D;
		for(Stu stu:stuList){
			totalScore+=stu.getScore();
		}
		
		averageScore=totalScore/stuList.size();
		
		double[] an={totalScore,averageScore};
		return an;
	} 
	



}

class ClassRoom{
	private List<Stu> stuList;
	private String classRoom;
	public List<Stu> getStuList() {
		return stuList;
	}
	public void setStuList(List<Stu> stuList) {
		this.stuList = stuList;
	}
	public String getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}
	public ClassRoom(String classRoom,List<Stu> stuList){
		this.stuList=stuList;
		this.classRoom=classRoom;
	}
}
