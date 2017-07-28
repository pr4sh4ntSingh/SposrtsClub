package practice;

public class Arrange {

	public static void main(String args[]){
		int a[]={1,2,2,0,0};
		int ans[]=uniqueValue(5, a);
		for(int p=0;p<5;p++)System.out.print(ans[p] + "  "); System.out.println();
	}
	public static int[] uniqueValue(int input1,int[] input2)
    {
     int n=input1;
     int arr[]=input2;
     int ans[]=new int[n];
     for(int k=0;k<n;k++){
              arrange(arr,ans,n,k); 	
              
     }
   	return ans;	
    }
	public static void arrange(int arr[],int ans[],int n,int k){
		int zeroi=indexOfFirstZero(arr,n);
		//System.out.println((zeroi+1)+"df");
		ans[k]=zeroi+1;
		int elem=arr[zeroi];
		for(int i=0;i<zeroi;i++){
					arr[i]--;
		}
		
	}
	public static int indexOfFirstZero(int arr[],int n){
		int i=0;
		for(i=0;i<n;i++){ 
			if(arr[i]==0) break;
		}
		arr[i]=-1;
		return i;
	}
}
