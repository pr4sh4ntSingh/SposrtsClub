package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Apple {
	static int lessis=2;
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t>0){
			t--;
			String s[]=br.readLine().split(" ");
			int a=Integer.parseInt(s[0]);
			int b=Integer.parseInt(s[1]);		
			int ax=Integer.parseInt(s[2]);
			int bx=Integer.parseInt(s[3]);
			int min,minx,c,cx;
			
			if(a<=b){
			      min=a;
				 minx=ax;
				 c=b;
				 cx=bx;
				
			}
			else{
				 min=b;
				 minx=bx;
				 c=a;
				 cx=ax;
				
			}
			System.out.println(min+" min "+minx+c+cx);
			if(minx==cx && a!=c){
				System.out.println(Math.abs(ax-bx));
			}
			else if(minx==cx && min==c){
				System.out.println("0");
			}
			else if(min==c){
				System.out.println("0");
			}
			else{
				int lcm=calculateLCM(minx,cx);
				
				int n1=(min+lcm)/minx;
				int n2=(cx+lcm)/cx;
				int start=calculate(min,minx,c,cx);
				System.out.println("lcm is " +lcm);
				System.out.println("start is " +start);
				int arr1[]=new int[n1];
				int arr2[]=new int[n2];
				for(int i=0;i<arr1.length;i++){
				   arr1[i]=min+start*minx;	
				   start=start+minx
				}
				for(int i=0;i<arr2.length;i++){
					arr2[i]=c+i*cx;
				}
				for(int i=0;i<arr1.length;i++)
					System.out.print(arr1[i]+" ");
				System.out.println();
				for(int i=0;i<arr2.length;i++)
					System.out.print(arr2[i]+" ");
				
        	}
		
	    }
		
   }
	static int calculateLCM(int n1,int n2){
		int minMultiple=n1;
		while(true){
			if(minMultiple%n1==0 && minMultiple%n2==0){
			return minMultiple;
				
			}
			minMultiple++;
		}
	}
static int calculate(int min,int minx,int c,int cx){
	int start=0;
	int a=(c-min)/minx;
    start=min+minx*a;
    return a;
}

}
