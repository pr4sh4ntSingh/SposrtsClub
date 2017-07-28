package practice;

import java.util.Arrays;
import java.util.TreeSet;
import java.io.*;

public class AlmostSort {
//static TreeSet<Integer> ts=new TreeSet<Integer>();
public static void main(String args[])throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int t=Integer.parseInt(br.readLine());
	while(t>0){
		t--;
		int sizes=Integer.parseInt(br.readLine());
		String s[]=br.readLine().split(" ");
		int size=s.length;
		int ts[]=new int[size]; 
		int old[]=new int[size];
		for(int i=0;i<size;i++){
			ts[i]=(Integer.parseInt(s[i]));
			old[i]=Integer.parseInt(s[i]);
		}
		Arrays.sort(ts);
		//for(int i=0;i<size;i++)
		   // System.out.println("*"+old[i]);
		int prev=-1,next=old[1],curr=old[0];
		int flag=0;
	for(int i=0;i<size;i++){
		if(ts[i]==(prev)||ts[i]==(curr)||ts[i]==(next)){
			prev=curr;
			curr=next;
			if(i+1!=size){
				next=old[i+1];
			}
			else next=-1;
		}
		else {
			//System.out.println(i);
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
