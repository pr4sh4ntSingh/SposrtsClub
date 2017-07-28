package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palin {
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t>0){
			t--;
			int n=Integer.parseInt(br.readLine());
			int d=n/26;
			int m=n%26;
			String s2="abcdefghijklmnopqrstuvwxyz";
			String s3=s2.substring(0,m);
			String ans="";
			while(d>0){
				ans=ans+s2;
				d--;
			}
			ans=ans+s3;
			System.out.println(ans);
		}
	}

}
