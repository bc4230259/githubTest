package com.igeek.homework3;

public class Labtop {

	public void powerOn(){
		System.out.println("����");
		Screen sc=new Screen();
		sc.workMethod();
	}
public void powerOff(){
		System.out.println("�ػ�");
	}

	public void useUsb(USB usb){
		usb.on();
		usb.workMethod();
		usb.off();
	}
}
