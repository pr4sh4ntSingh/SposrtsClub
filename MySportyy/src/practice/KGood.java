package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class KGood {
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t>0){
			t--;
		String s[]=br.readLine().split(" ");
		String word=s[0];
		int k=Integer.parseInt(s[1]);
		char []w=word.toCharArray();
		int fc[]=new int[26];
	    Arrays.fill(fc,0);
	    int unique=0;
		for(int i=0;i<w.length;i++){
			fc[w[i]-'a']++;
			if(fc[w[i]-'a']==1)
				unique++;
		}
		quickSort(fc,0,25);
		for(int i=0;i<unique;i++){
			System.out.println(fc[i]);
		}
		int min=fc[unique-1];
		int max=fc[0];
		int diff=max-min;
		System.out.println("i diff is "+diff);
		int turn=diff-k;
		ArrayList<Integer> frequency=makeFrequency(fc,unique);
		System.out.println(frequency);
		int first=frequency.get(0);
		int last=frequency.get(frequency.size()-1);
		int count=0;
		while(turn>0){
		if(first<last*min){  //delete first and add to count
			int temp=frequency.get(0);
			count=count+temp;
			frequency.set(1, first+temp);
			frequency.remove(0);
			System.out.println(frequency);
		}
		else if(first>=last*min){  //delete last element
			int temp1=frequency.get(frequency.size()-1);
			count=count+temp1*min;
			frequency.remove(frequency.size()-1);
			System.out.println(frequency);
			min++;
		}
		first=frequency.get(0);
		last=frequency.get(frequency.size()-1);
		turn--;
		}
	
		
		int newmax=min+k;
		System.out.println("max - min ="+max +" "+min);
		System.out.println("newmax is "+newmax);
		System.out.println(count);
		
	   }
	}
	private static ArrayList<Integer> makeFrequency(int[] fc, int unique) {
	    ArrayList<Integer> freq=new ArrayList<Integer>();
	    int f=1;
	    for(int i=1;i<=unique;i++){
	    	if(fc[i]==fc[i-1])
	    		f++;
	    	else {
	    		freq.add(f);
	    		f=1;
	    	}
	    }
		return freq;
	}
	static void quickSort(int a[],int p,int q){
		 if(p<q){
			 int r=partition(a,p,q);
			 quickSort(a,p,r-1);
			 quickSort(a,r+1,q);
		 }
		 
	 }
	 static int partition(int a[],int p,int q){
		 int key=a[q];
		 int i=p-1;    // covers elements which are less than key
		 int j=p;    // covers elements which are greater than key
		 for(int k=p;k<=q-1;k++){
			 if(a[k]<key){        // if element is greater than key then cover it under j
				 j++;
			 }
			 else{               // if elemnt is less than key send it at i+1 position and cover it by i
				 //swap
				 int temp=a[k];
				 a[k]=a[i+1];
				 a[i+1]=temp;
				 i++;
				 j++;
			 }
		 }
		 //swap a[i+1] and a[q]
		 int temp=a[i+1];
		 a[i+1]=a[q];
		 a[q]=temp;
		 return i+1;
	 }

}

