package com.igeek.databaseStu;

import java.util.regex.Pattern;

public class Student {
	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public Student(){
		
	}
	String sno;
	String name;
	int age;
	int score;
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Student(String sno,String name, int age,int score){
		this.name=name;
		this.age=age;
		this.sno=sno;
		this.score=score;
	}
	public Student(String name, int age){
		this.name=name;
		this.age=age;
		
	}
	
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static boolean isInteger(String str) {  
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");  
        return pattern.matcher(str).matches();  
  }		
	protected void cry(){
		System.out.println("Student Cry");
	}
}
