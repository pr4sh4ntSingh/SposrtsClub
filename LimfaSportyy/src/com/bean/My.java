package com.bean;

import java.util.Random;

public class My {
	public static void main(String[] args) {
		String a = "INSERT INTO JOURNEY VALUES(NULL,";
		int maximum = 10, minimum = 1;
		for (int ii = 0; ii < 10; ii++) {
			Random rn = new Random();
			int x=rn.nextInt();
			x=(x<0)?x:(-x);
			int y=rn.nextInt();
			y=(y<0)?y:(-y);
			int z=rn.nextInt();
			z=(z<0)?z:(-z);
			y=(y<0)?y:(-y);
			int p=rn.nextInt();
			p=(p<0)?p:(-p);
				
			int randomNum1=100+x%10;
			int randomNum2=1400+rn.nextInt()%10;
			int randomNum3=10+rn.nextInt()%10;
			int randomNum4=1+rn.nextInt()%12;
			int randomNum5=1+rn.nextInt()%12;
			a=a+","+randomNum1+"26-"+randomNum4+"-2016,28-"+randomNum5+"-2016/,"+randomNum2+","+randomNum3+","+randomNum3+")";
			System.out.println(a);
		}
	}
}
