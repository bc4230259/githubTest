package com.igeek.homework3;

public class Stu {
	private String name;
	private String classNumber;
	private double score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(String classNumber) {
		this.classNumber = classNumber;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}

	public Stu(String name, String classNumber, double score){
		this.name=name;
		this.classNumber=classNumber;
		this.score=score;
	}
}
