package com.igeek.homework3;

public class Labtop {

	public void powerOn(){
		System.out.println("开机");
		Screen sc=new Screen();
		sc.workMethod();
	}
public void powerOff(){
		System.out.println("关机");
	}

	public void useUsb(USB usb){
		usb.on();
		usb.workMethod();
		usb.off();
	}
}
