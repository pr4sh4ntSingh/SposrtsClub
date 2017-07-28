package com.dbutil;

public class Sort{
public static void main(String[] args)
	{
		int ank[]={12,333,1,110};
		
		int j;
		for(int i=1;i<ank.length;i++)
	    {
	    int item=ank[i];
	       for( j=i-1;j>=0 && ank[j]>item;j--)
	       {  ank[j+1]=ank[j];}
	    ank[j+1]=item;
	    }
		for(int i=0;i<ank.length;i++)
			
		System.out.println(ank[i]);
	    
		
		
	}
}