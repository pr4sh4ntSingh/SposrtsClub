package com.dbutil;

public class Skyagent2 {
	public static void main(String args[])

	{
		long robo=3,pm=0,moleAss=1;
		long n=1000000007l;
	   long pmp=0,robop=3;
		long molassp=1;
	 for(long i=0;i<n;i++)
	    {
		pmp=pm;
		pm=(5*moleAss)%1000000007;
		robop=(robo)%1000000007;
		robo=(robop+3*pmp)%1000000007;
		molassp=(moleAss)%1000000007;
		moleAss=(robop+2*pmp)%1000000007;
		
		
		System.out.println(robo+"#"+moleAss+"#"+pm + "at i="+i);

		
		}
	 

	}
}
