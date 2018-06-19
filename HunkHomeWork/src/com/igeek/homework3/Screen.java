package com.igeek.homework3;

public class Screen extends Hardware {

	public void workMethod(){
		System.out.println("显示屏显示画面");
	}
}

class Mouse extends Hardware implements USB{
	public void workMethod(){
		System.out.println("鼠标点击");
	}
	public void on(){
		System.out.println("连接鼠标的USB");
	}
	public void off(){
		System.out.println("断开鼠标的USB");
	}

}

class Keyboard extends Hardware implements USB{
	public void workMethod(){
		System.out.println("键盘按键");
	}
	public void on(){
		System.out.println("连接键盘的USB");
	}
	public void off(){
		System.out.println("断开键盘的USB");
	}
	
}


