package com.igeek.homework1;

public class Test1 {

	 public Test1(){
	    	System.out.println("���췽��һ��������");
	    }
	    public Test1(int x){
	    	this();
	    	System.out.println("���췽������������");
	    }
	    public Test1(boolean b){
	    	this(1);
	    	System.out.println("���췽������������");
	    }
	    public static void main(String[] args) {
			Test1 test = new Test1(true);
		}


}
