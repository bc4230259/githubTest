package com.igeek.homework1;

public class Car {
	public String mark;
	public Car(String mark){
		this.mark =mark;
	}
	
	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}
	
	public void drive(){
		System.out.println("本车正在驾驶");
	}
}
