package com.igeek.homework3;

public class Screen extends Hardware {

	public void workMethod(){
		System.out.println("��ʾ����ʾ����");
	}
}

class Mouse extends Hardware implements USB{
	public void workMethod(){
		System.out.println("�����");
	}
	public void on(){
		System.out.println("��������USB");
	}
	public void off(){
		System.out.println("�Ͽ�����USB");
	}

}

class Keyboard extends Hardware implements USB{
	public void workMethod(){
		System.out.println("���̰���");
	}
	public void on(){
		System.out.println("���Ӽ��̵�USB");
	}
	public void off(){
		System.out.println("�Ͽ����̵�USB");
	}
	
}


