package com.igeek.ListStu;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StuManagerView {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StuManager stuManager=new StuManager();
		while(true){
		System.out.println("--------��ӭ����ѧ������ϵͳ--------");
		System.out.println("1 ���ѧ��");
		System.out.println("2 �鿴����ѧԱ��Ϣ");
		System.out.println("3 ����ѧ����ʾѧԺ��Ϣ");
		System.out.println("4 ��ѧ������");
		System.out.println("5 ����ѧ��ɾ��ѧ��");
		//System.out.println("6 ��ѧ���������򣬷�ҳ��ʾѧԱ��Ϣ��ÿҳ����");
		System.out.println("7 �˳�");
		System.out.println("���������ѡ��");
		String option=sc.next();
		switch(option){
		case "2":
			stuManager.findAll();
			break;
		case "1":
			System.out.println("������ѧ����ѧ�ţ����������䣬��������ȫ�Ƕ��Ÿ���");
			String temp=sc.next();
			if(temp.split("��").length<4){
				System.out.println("ȱ��������Ϣ������������");
				break;
			}
			if( !Student.isInteger(temp.split("��")[2])||!Student.isInteger(temp.split("��")[3])){
				System.out.println("�����������ͷ�������Ϊ���֣�����������");
				break;
			}
			stuManager.addStu(temp.split("��")[0],temp.split("��")[1],Integer.parseInt(temp.split("��")[2]),Integer.parseInt(temp.split("��")[3]));
			break;
		case "3":
			System.out.println("������Ҫ��ѯѧ����ѧ��");
			String temp3=sc.next();
			 stuManager.search(temp3);
//			System.out.println("������Ҫɾ��ѧ����ѧ��");
//			String temp3=sc.next();
//			 stuManager.deleteStu(temp3);
			break;
		case "4":
			System.out.println("������Ҫ����ѧ����ѧ��");
			String temp4=sc.next();
			 stuManager.updateStu(temp4);
			break;
		case "5":
			System.out.println("������Ҫɾ��ѧ����ѧ��");
			String temp5=sc.next();
			 stuManager.deleteStu(temp5);
			break;
//		case"6":
//			System.out.println("������Ҫ��ѯ��ѧ��ѧ��");
//			String temp6=sc.next();
//			stuManager.search(temp6);
//			break;
		case"7":
//			stuManager.ExportStu();
			System.out.println("��лʹ�ñ�ϵͳ���ڴ������´�ʹ��");
			System.exit(0);
			break;
		default:
			System.out.println("�����������������");
			break;
		}
		
		}
		
		
	}
	 
}
