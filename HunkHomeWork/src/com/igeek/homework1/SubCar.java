package com.igeek.homework1;

public class SubCar extends Car {
 int price;
 int speed;
 public SubCar(String mark,int price, int speed){
	 super(mark);
	 this(mark,price,speed);
	 this.price=price;
	 this.speed=speed;
	 System.out.println("本车的品牌是"+super.mark);
	 System.out.println(super.mark+"车的价格是"+this.price);
	 System.out.println(super.mark+"车原来的速度是"+this.speed);
 }
 
 public void speedChange(int newSpeed){
	 this.speed=newSpeed;
	 System.out.println(super.mark+"车现在的速度是"+this.speed);
 }
}
