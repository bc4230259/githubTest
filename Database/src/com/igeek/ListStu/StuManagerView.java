package com.igeek.ListStu;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StuManagerView {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StuManager stuManager=new StuManager();
		while(true){
		System.out.println("--------欢迎来到学生管理系统--------");
		System.out.println("1 添加学生");
		System.out.println("2 查看所有学员信息");
		System.out.println("3 根据学号显示学院信息");
		System.out.println("4 给学生评分");
		System.out.println("5 根据学号删除学生");
		//System.out.println("6 按学号升序排序，分页显示学员信息，每页三条");
		System.out.println("7 退出");
		System.out.println("请输入你的选择：");
		String option=sc.next();
		switch(option){
		case "2":
			stuManager.findAll();
			break;
		case "1":
			System.out.println("请输入学生的学号，姓名，年龄，分数并以全角逗号隔开");
			String temp=sc.next();
			if(temp.split("，").length<4){
				System.out.println("缺少输入信息，请重新输入");
				break;
			}
			if( !Student.isInteger(temp.split("，")[2])||!Student.isInteger(temp.split("，")[3])){
				System.out.println("输入错误，年龄和分数必须为数字，请重新输入");
				break;
			}
			stuManager.addStu(temp.split("，")[0],temp.split("，")[1],Integer.parseInt(temp.split("，")[2]),Integer.parseInt(temp.split("，")[3]));
			break;
		case "3":
			System.out.println("请输入要查询学生的学号");
			String temp3=sc.next();
			 stuManager.search(temp3);
//			System.out.println("请输入要删除学生的学号");
//			String temp3=sc.next();
//			 stuManager.deleteStu(temp3);
			break;
		case "4":
			System.out.println("请输入要评分学生的学号");
			String temp4=sc.next();
			 stuManager.updateStu(temp4);
			break;
		case "5":
			System.out.println("请输入要删除学生的学号");
			String temp5=sc.next();
			 stuManager.deleteStu(temp5);
			break;
//		case"6":
//			System.out.println("请输入要查询的学生学号");
//			String temp6=sc.next();
//			stuManager.search(temp6);
//			break;
		case"7":
//			stuManager.ExportStu();
			System.out.println("感谢使用本系统，期待您的下次使用");
			System.exit(0);
			break;
		default:
			System.out.println("输入错误，请重新输入");
			break;
		}
		
		}
		
		
	}
	 
}
