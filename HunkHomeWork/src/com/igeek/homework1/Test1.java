package com.igeek.homework1;

public class Test1 {

	 public Test1(){
	    	System.out.println("构造方法一被调用了");
	    }
	    public Test1(int x){
	    	this();
	    	System.out.println("构造方法二被调用了");
	    }
	    public Test1(boolean b){
	    	this(1);
	    	System.out.println("构造方法三被调用了");
	    }
	    public static void main(String[] args) {
			Test1 test = new Test1(true);
		}


}
