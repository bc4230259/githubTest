package com.igeek.homework1;

public class SubCar extends Car {
 int price;
 int speed;
 public SubCar(String mark,int price, int speed){
	 super(mark);
	 this(mark,price,speed);
	 this.price=price;
	 this.speed=speed;
	 System.out.println("������Ʒ����"+super.mark);
	 System.out.println(super.mark+"���ļ۸���"+this.price);
	 System.out.println(super.mark+"��ԭ�����ٶ���"+this.speed);
 }
 
 public void speedChange(int newSpeed){
	 this.speed=newSpeed;
	 System.out.println(super.mark+"�����ڵ��ٶ���"+this.speed);
 }
}
