package com.igeek.homework3;

import java.util.*;


public class Exercise3Test {

	public static void main(String[] args) {
		// initialize
		List<Stu> stuList=new ArrayList<Stu>();
		Exercise3Test e3=new Exercise3Test();
			stuList.add(new Stu("小明","1班",50));
			stuList.add(new Stu("小明","1班",60));
			stuList.add(new Stu("小明","2班",87));
			stuList.add(new Stu("小明","2班",52));
			stuList.add(new Stu("小明","2班",59));
			stuList.add(new Stu("小明","3班",95));
			stuList.add(new Stu("小明","3班",45));
			stuList.add(new Stu("小明","2班",72));
			stuList.add(new Stu("小明","1班",82));
			stuList.add(new Stu("小明","1班",62));
			stuList.add(new Stu("小明","1班",57));
			stuList.add(new Stu("小明","2班",80));
			stuList.add(new Stu("小明","3班",90));
			
		List<Stu> classOneStus=new ArrayList<Stu>();	
		List<Stu> classTwoStus=new ArrayList<Stu>();
		List<Stu> classThreeStus=new ArrayList<Stu>();
		
		for(Stu stu:stuList){
			if(stu.getClassNumber().equals("1班")){
				classOneStus.add(stu);
			}else if(stu.getClassNumber().equals("2班")){
				classTwoStus.add(stu);
			}else{
				classThreeStus.add(stu);
			}
		}	
		
		ClassRoom cr1=new ClassRoom("班级1",classOneStus);
		ClassRoom cr2=new ClassRoom("班级2",classTwoStus);
		ClassRoom cr3=new ClassRoom("班级3",classThreeStus);
		
		Map<String,ClassRoom> classStuMap=new HashMap<>();
		
		classStuMap.put("1班", cr1);
		classStuMap.put("2班", cr2);
		classStuMap.put("3班", cr3);
		
		for(Map.Entry<String,ClassRoom> classAndStu:classStuMap.entrySet()){
			double[] scores=e3.counting(classAndStu.getValue().getStuList());
			System.out.println(classAndStu.getKey()+"的总分为:"+scores[0]+"平均分为:"+scores[1]);
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
