package com.igeek.randomp;

import java.math.BigDecimal;
import java.util.ArrayList;

public class RandomSource {
 public ArrayList<Prizes> prize=new ArrayList<Prizes>();
 
 public RandomSource(){
	 
		 Prizes pri=new Prizes();
		 pri.setRate(new BigDecimal("0.06"));
		 pri.setSupportCount(1);
		 this.prize.add(pri);
		 Prizes pri4=new Prizes();
		 pri4.setRate(new BigDecimal("0.01"));
		 pri4.setSupportCount(2);
		 this.prize.add(pri4);
		 Prizes pri14=new Prizes();
		 pri14.setRate(new BigDecimal("0.01"));
		 pri14.setSupportCount(3);
		 this.prize.add(pri14);
		 Prizes pri5=new Prizes();
		 pri5.setRate(new BigDecimal("0.005"));
		 pri5.setSupportCount(4);
		 this.prize.add(pri5);
		 Prizes pri6=new Prizes();
		 pri6.setRate(new BigDecimal("0.005"));
		 pri6.setSupportCount(5);
		 this.prize.add(pri6);
		 Prizes pri7=new Prizes();
		 pri7.setRate(new BigDecimal("0.002"));
		 pri7.setSupportCount(6);
		 this.prize.add(pri7);
		 Prizes pri8=new Prizes();
		 pri8.setRate(new BigDecimal("0.002"));
		 pri8.setSupportCount(7);
		 this.prize.add(pri8);
		 Prizes pri9=new Prizes();
		 pri9.setRate(new BigDecimal("0.002"));
		 pri9.setSupportCount(8);
		 this.prize.add(pri9);
		 Prizes pri10=new Prizes();
		 pri10.setRate(new BigDecimal("0.002"));
		 pri10.setSupportCount(9);
		 this.prize.add(pri10);
		 Prizes pri11=new Prizes();
		 pri11.setRate(new BigDecimal("0.002"));
		 pri11.setSupportCount(10);
		 this.prize.add(pri11);

	 
	 Prizes pri2=new Prizes();
	 pri2.setRate(new BigDecimal("0.1"));
	 pri2.setSupportCount(20);
	 this.prize.add(pri2);
	 Prizes pri3=new Prizes();
	 pri3.setRate(new BigDecimal("0.1"));
	 pri3.setSupportCount(30);
	 this.prize.add(pri3);
	 Prizes pri1=new Prizes();
	 pri1.setRate(new BigDecimal("0.7"));
	 pri1.setSupportCount(0);
	 this.prize.add(pri1);
	 	
 }
 
 
}
