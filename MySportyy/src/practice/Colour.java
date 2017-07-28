package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Colour {

	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t>0){
			t--;
			int n=Integer.parseInt(br.readLine());
			String s[]=br.readLine().split(" ");
			boolean ans=false;
			int c=0;
			for(int i=1;i<s.length-1;i++){
				if(s[i-1].equals(s[i]) && s[i].equals(s[i+1]))
					ans=true;
			}
			if(ans) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
