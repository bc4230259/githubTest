package com.igeek.homework2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/**
	 * 1��	ʹ��ArrayList���ϣ��������10����ͬ��Ԫ�أ���ʹ��forѭ�������ü��ϡ�
	 * ��ʾ��
		1��ʹ��add()������Ԫ����ӵ�ArrayList�����С�
	 */
		
//	ArrayList<String> al=new ArrayList();
//	for (int i = 0; i < 10; i++) {
//		al.add(i+"");
//	}
//	for(String a :al){
//		System.out.println(a);
//	}
/**
 * 2��	��HashSet�������������Person���󣬰�������ͬ���˵���ͬһ���ˣ���ֹ�ظ���ӡ�
 */
//		Set<Person> s=new HashSet();
//		s.add(new Person("С��",23));
//		s.add(new Person("С��",12));
//		s.add(new Person("С��",11));
//		for(Person p:s){
//			System.out.println(p.getName());
//		}
		
		/**
		 * ѡ����ʵ�Map���ϱ���5λѧԱ��ѧ�ź�������Ȼ����Щ��ֵ��(stuNo---stuName)һһ��ӡ������
		 */
//		HashMap<Integer,String> stu=new HashMap();
////		List<Integer> al=new ArrayList<Integer>();
//		    stu.put(2, "John");			
//			stu.put(1, "Lucy");
//			stu.put(4, "Aimee");	
//			stu.put(3, "Smith");
//			stu.put(5, "Amanda");
//		
//		for(Integer stuNo:stu.keySet()){
//			System.out.println(stuNo);
//			System.out.println(stu.get(stuNo));
//		}
		
//		File file=new File("D:\\aa");
//		System.out.println(file.length());
//		System.out.println(file.isFile());
//		System.out.println(file.isDirectory());
//		System.out.println(file.exists());
//		File file1=new File("D:\\aa\\bb.txt");
//			File[] fls=file.listFiles();
//			file.mkdirs();
//			for(File f:fls){
//				System.out.println(f.getName());
//			}
		
		String ss="asodfjaopwefj";
		System.out.println(ss.length());
		System.out.println(ss.indexOf("j"));
		System.out.println(ss.charAt(0));
}
}

class Person  {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	private Integer age;
	
	public Person(String name,Integer age){
		this.name=name;
		this.age=age;
	}
	
	public boolean equals(Object obj) {
	
		
		Person otherP = (Person)obj;
		
		if(!this.name.equals(otherP.name)) {
			return false;
		}

		return true;
	}

public int hashCode() {
		
		
		int thisHashCode = 0;
		
		//��ȡname���Ե�hashCodeֵ
		thisHashCode += name.hashCode()*17;
		
		
		
		return thisHashCode;

	}

	
}
class Circle implements Shape{
	final static double   pi =3.1415926;
	
	public double area(double r){
		return pi*r*r;
	}
}