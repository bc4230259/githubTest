package com.igeek.randomp;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomSource rs=new RandomSource();
		Integer tc=1;
		RandomDao rd=new RandomDao();
//		for(Prizes pr:rs.prize){
//		System.out.println(pr.getSupportCount());
//		}
		Integer a1=0,a2=0,a3=0,a4=0,a5=0,a6=0,a7=0,a8=0,a9=0,a10=0,a11=0,a12=0,a13=0;
		for (int i = 1; i <31; i++) {
			Integer sp=rd.randomSupport(rs.prize, tc); 
			switch(sp){
			case 1: a1++;
					break;
			case 2: a2++;
			break;
			case 3: a3++;
			break;
			case 4: a4++;
			break;
			case 5: a5++;
			break;
			case 6: a6++;
			break;
			case 7: a7++;
			break;
			case 8: a8++;
			break;
			case 9: a9++;
			break;
			case 10: a10++;
			break;
			case 0: a11++;
			break;
			case 20: a12++;
			break;
			case 30: a13++;
			break;
			};
			
			tc++;
//			if(i%10==0){
//				System.out.println(sp);
//			}else{
//			System.out.print(sp);
//			}
		}
//	
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
		System.out.println(a8);
		System.out.println(a9);
		System.out.println(a10);
		System.out.println(a11);
		System.out.println(a12);
		System.out.println(a13);
		
//		System.out.println((double)a1/tc*100);
//		System.out.println((double)a2/tc*100);
//		System.out.println((double)a3/tc*100);
//		System.out.println((double)a4/tc*100);
//		System.out.println((double)a5/tc*100);
//		System.out.println((double)a6/tc*100);
//		System.out.println((double)a7/tc*100);
//		System.out.println((double)a8/tc*100);
//		System.out.println((double)a9/tc*100);
//		System.out.println((double)a10/tc*100);
//		System.out.println((double)a11/tc*100);
//		System.out.println((double)a12/tc*100);
//		System.out.println((double)a13/tc*100);
	}

}
