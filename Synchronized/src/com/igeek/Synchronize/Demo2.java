package com.igeek.Synchronize;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fish fish=new Fish();
		Farmer f=new Farmer(fish);
		Thread far=new Thread(f);
		far.start();
		Cat1 c=new Cat1(fish);
		Thread ca=new Thread(c);
		ca.start();
	}

}

class Cat1 implements Runnable{
	Fish fish;
	public Cat1(Fish fish){
		this.fish=fish;
	}
	@Override
	public  void run() {
	
		while(true)
		{	
			synchronized(fish){
			
				if(!fish.flag){
			try {
				fish.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			System.out.println("吃了一条鱼"+fish.name+fish.color);
			fish.flag=false;
			fish.notify();
			
			}
		
		
		}
		
	}
	
}
class Farmer implements Runnable{
	Fish fish;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true){
			synchronized(fish){
			if(fish.flag){
				try {
					fish.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			fish.name="小白";
			fish.color="白色";
			fish.flag=true;
			System.out.println("养了一条鱼"+fish.name+fish.color);
			fish.notify();
			}
		}
		
		
	}
	public Farmer(Fish fish){
		this.fish=fish;
	}
}
class Fish{
	String name;
	String color;
	boolean flag=false;
	
}