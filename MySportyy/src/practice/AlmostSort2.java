package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlmostSort2 {
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t>0){
			t--;
			int size=Integer.parseInt(br.readLine());
			String s[]=br.readLine().split(" ");
			int prev=0,next=2,curr=1;
			int flag=0;
			for(int i=0;i<size;i++){
				int x=Integer.parseInt(s[i]);
				if(x==(prev)||x==(curr)||x==(next)){
					prev++;
					curr++;
					next++;
					
					
				}
				else{
					flag=-1;
					break;
				}
			}
			if(flag==-1)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}
}
