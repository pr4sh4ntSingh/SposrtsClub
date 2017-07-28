package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kithen {

	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t>0){
			t--;
			int n=Integer.parseInt(br.readLine());
			
			String a[]=br.readLine().split(" ");
			String b[]=br.readLine().split(" ");
			int aa[]=new int[a.length];
			int bb[]=new int[a.length];
			for(int i=0;i<aa.length;i++){
				aa[i]=Integer.parseInt(a[i]);
			}
			for(int i=0;i<aa.length;i++){
				bb[i]=Integer.parseInt(b[i]);
			}
			int count=0;
			for(int i=0;i<n;i++){
				int time;
				if(i==0)time=aa[i];
				else time=aa[i]-aa[i-1];
				if(time>=bb[i]){
					count++;
				}
				
			}
			System.out.println(count);
			
			
		}
	}
}
