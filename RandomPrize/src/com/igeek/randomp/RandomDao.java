package com.igeek.randomp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomDao {
		public Integer randomSupport(ArrayList<Prizes> pri,Integer totalCount){
			Random random=new Random();
			BigDecimal randomSeed=new BigDecimal(Double.toString(Math.random()));
			BigDecimal  min = BigDecimal.ZERO;
			BigDecimal  max = BigDecimal.ZERO;
			
			for (int i = 0; i < pri.size(); i++) {
				max=max.add(pri.get(i).getRate());
				if(min.compareTo(randomSeed)!=1 && randomSeed.compareTo(max)==-1){
					Integer b=pri.get(i).getUserCount();
					double c=(double)(b)/totalCount;
					if(new BigDecimal(Double.toString(c)).compareTo(pri.get(i).getRate())==-1){
						pri.get(i).setUserCount(pri.get(i).getUserCount()+1);
						return pri.get(i).getSupportCount();
					}else{
						List<Prizes> satisfiedPrizes = new ArrayList<>();
			            for (Prizes prize1 : pri) {
			                if ((double) prize1.getUserCount() / (double) totalCount < prize1.getRate().doubleValue()) {
			                    satisfiedPrizes.add(prize1);
			                }
			            }
			            if (satisfiedPrizes.isEmpty()) {
			                return null;
			            } else {
			            	Prizes pri2=satisfiedPrizes.get(random.nextInt(satisfiedPrizes.size()));
			            	pri2.setUserCount(pri2.getUserCount()+1);
			                return pri2.getSupportCount();

			            }
					}
				}
				min=max.add(BigDecimal.ZERO);
				
			}
			
			return 0;
			
		}
}


