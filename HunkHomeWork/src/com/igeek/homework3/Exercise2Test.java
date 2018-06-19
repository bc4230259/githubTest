package com.igeek.homework3;

import java.util.Scanner;



public class Exercise2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一串字符串");
		String s=sc.nextLine();	
		int sp=s.indexOf("java");
		int num=0;
		 String ss=s;
		while (sp!=-1){	
			String firstString=ss.substring(0, sp);
			String lastString=ss.substring(sp+4);
			 ss=firstString+lastString;
			sp=ss.indexOf("java");
			num++;
		}
		
	
		System.out.println("原字符串：\""+s+"\"中");
		System.out.println("总共包含"+(num)+"个java 删除java后的字符串为：\""+ss+"\"");
		sc.close();
	}

}
