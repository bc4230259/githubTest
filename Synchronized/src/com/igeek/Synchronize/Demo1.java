package com.igeek.Synchronize;

public class Demo1 {

	public static void main(String[] args) {
//		Dog dog1=new Dog();
//		Dog dog2=new Dog();
//		dog1.setName("С��1");
//		dog2.setName("С��2");
//		dog1.start();
//		dog2.start();
		Cat cat=new Cat();
		Thread cat1=new Thread(cat,"Сè1");
		Thread cat2=new Thread(cat,"Сè2");
		Thread cat3=new Thread(cat,"Сè3");
		Thread cat4=new Thread(cat,"Сè4");
		Thread cat5=new Thread(cat,"Сè5");
		Thread cat6=new Thread(cat,"Сè6");
		cat1.start();
		cat2.start();
		cat3.start();
		cat4.start();
		cat5.start();
		cat6.start();
		
		

	}

}

class Dog extends Thread{
	public static int total=101;
	public void run(){
		while(true)
		{
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized(Dog.class){
			if(total>0){
				System.out.println(Thread.currentThread().getName() +"�Թ�ͷ"+total);
				total--;
			}else
			{
				break;
			}
			}
		}
		
	}
}

class Cat implements Runnable{
	public int total=101;
	@Override
	public synchronized void run() {
		while(true)
		{
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized(this){
			if(total>0){
				System.out.println(Thread.currentThread().getName() +"�Թ�ͷ>0"+total);
				total--;
			}else
			{
				break;
			}
			}
		
			synchronized(this){
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(total%2==0){
					System.out.println(Thread.currentThread().getName() +"�Թ�ͷ%2"+total);
					total--;
				}else
				{
					break;
				}
				}
		}
		
	}
	
}
