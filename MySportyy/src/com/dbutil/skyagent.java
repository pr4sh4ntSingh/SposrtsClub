package com.dbutil;

class skyagent
{
static int rb[]=new int[10000000];
static int molAss[]=new int[10000000];
static int pm[]=new int [1000000];
static int n=900001;

 public static void main(String args[])
    {
	rb[0]=3;
	molAss[0]=1;
	pm[0]=0;
	
	  for(int i=1;i<=n;i++)
	  {
			pm[i]=(5*molAss[i-1])%1003;
			molAss[i]=(rb[i-1]+2*pm[i-1])%1003;
			rb[i]=(rb[i-1]+3*pm[i-1])%1003;
		
	  
	  
	  }
	  for( int i=2;i<n;i++)
	  {
	 //System.out.println("rb="+rb[i]+" molAss="+molAss[i]+" pm="+pm[i] +" and i="+i);
		  if( rb[i]==rb[01] && molAss[i]==molAss[01]&& pm[i]==pm[01])
	  System.out.println(i);
	  }
	
	
	
	
		System.out.print(rb[n]+"#"+molAss[n]+"#"+pm[n]);
    }



}