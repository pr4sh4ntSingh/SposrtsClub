package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
	static int p=0,q=0;
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		
		while(t>0){
			t--;
			int n=Integer.parseInt(br.readLine());
			String a[]=br.readLine().split(" ");
			int aa[]=new int[a.length];
			boolean checkP=false;
			for(int i=0;i<aa.length;i++){
				aa[i]=Integer.parseInt(a[i]);
				if(aa[i]>0)
					checkP=true;
			}
			if(!checkP){
				System.out.println(min(aa)); 
			}
			else{
			double max=getMaxSumWitout(aa,-1);
		System.out.println("maximul Sum is "+max +"range is "+p+" "+q);
			/*for(int i=0;i<aa.length;i++){
				if(aa[i]<0){
					double temp=getMaxSumWitout(aa,i);
					//System.out.println("maximul Sum is "+temp+" witout "+i);
					if(temp>max)
					max=temp;
				}*/
		//	}
			//String s=String.format("%d", (long)max);
		//System.out.println(s);
	
			
			}
		}
			
		
	}
	
	private static int min(int[] aa) {
		// TODO Auto-generated method stub
		int min=Integer.MIN_VALUE;
		for(int i=0;i<aa.length;i++){
			if(aa[i]>min)
				min=aa[i];
		}
		return min;
	}

	public static double getMaxSumWitout(int[] a,int k){
		double maxSum=Double.MIN_VALUE;
		double sum=0;
		for(int i=0;i<a.length;i++){
			/*if(i==k) {
			 	i++;
			 	if(i>=a.length)  break;
			}*/
			
			sum=sum+a[i];
			//System.out.println(sum+" * " +i);
			if(maxSum<sum){
				maxSum=sum;
				q=i;
			}else if(sum<=0){
				sum=0;
				
			}
		 }
		
		return maxSum;
		
	}
}
