package com.igeek.homework1;

public class Student {
 private String name;
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

private int age;
 
 public Student(String name,int age){
	 this.name=name;
	 this.age=age;
 }
 
 public void show(){
	 System.out.println("ѧ�����֣�"+this.name+"  ѧ�����䣺"+this.age);
 }
}
