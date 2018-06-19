package com.igeek.homework3;

public class Exercise1Test {
public static void main(String[] args) {
	Labtop lp=new Labtop();
	lp.powerOn();
	lp.useUsb(new Mouse());
	lp.useUsb(new Keyboard());
	lp.powerOff();
	
	
}
}
