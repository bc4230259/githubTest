package com.igeek.homework1;

public class Undergraduate extends Student {
 String degree;

public String getDegree() {
	return degree;
}

public void setDegree(String degree) {
	this.degree = degree;
}

public Undergraduate(String name, int age, String degree){
	super(name,age);
	this.degree=degree;
}
public void show(){
	System.out.println("ѧ�����֣�"+this.getName()+"  ѧ�����䣺"+this.getAge()+"  ѧλ��"+this.degree);
} 
}
