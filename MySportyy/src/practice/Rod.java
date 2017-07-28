package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Rod {

	public static void main(String args[]){
		int a[]={2,4,5,9};
		//int ans[]=getJoinedPipes(a, a.length);
		ArrayList<String> str=new ArrayList<String>();
		str.add("dfd");
		str.add("d");
		str.add("dlkl");
		str.add("d3");
		str.add("dlkl4");
		str.add("d5");
		if(str.contains("dfd")){
			int n=str.indexOf("dlkl4fd");
		   System.out.println(str.indexOf("dlkl4fd"));}
//		for(int ii=0;ii<ans.length;ii++)
//			System.out.print(ans[ii]+" ");

		
	}
	 public static int[] getJoinedPipes(int []input1,int input2){
		  
		  
			int n=input2;
			int size=2*n-1;
			int arr[]=new int[size];
		    Arrays.sort(input1);
			Arrays.fill(arr,Integer.MAX_VALUE);
			for(int i=0;i<n;i++ )
				arr[i]=input1[i];

			int num=-1;
			int ans[]=new int[size-n];
			int k=0;
//			int aa[]={1,20,10,1};
//			int min[]=findTwoMin(aa);
//			System.out.println("num ,n,size------"+num +n+size);
			for(int i=n;i<size;i++){
				int min[]=findTwoMin(arr);
				num=arr[min[0]]+arr[min[1]];
				arr[i]=num;
				ans[k++]=num;
				arr[min[0]]=Integer.MAX_VALUE;
				arr[min[1]]=Integer.MAX_VALUE;
				
			//	System.out.println();
				
			}
			return ans;


		}
			static int[] findTwoMin(int[] arr){
				int i, first, second;
				 int min[]=new int[2];	    
			    first = second = Integer.MAX_VALUE;
			    int fi=0,si=0;
			    for (i = 0; i < arr.length ; i ++)
			    {
			        if (arr[i] < first)
			        {
			            second = first;
			            si=fi;
			            fi=i;
			            first = arr[i];
			        }
			        else if (arr[i] < second && arr[i] != first){
			            second = arr[i];
			            si=i;
			        }
			        else if(arr[i]==first){
			        	second=first;
			        	si=i;
			        }
			    }
			    min[0]=fi;
			    min[1]=si;
			    return min;
			    
			   }
	
}
