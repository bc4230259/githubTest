package com.igeek.homework1;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu=new Student("小明",23);
		Undergraduate under= new Undergraduate("小红",22,"本科");
		stu.show();
		under.show();
		
	}

}

 interface SS{
	void ha();
}

class st implements SS{
	
	protected void ha(){
		System.out.println("123");
	}
} 