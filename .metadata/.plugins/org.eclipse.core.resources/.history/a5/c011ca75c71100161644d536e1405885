package practice;

public class Circle {
	public static void main(String args[]){
		int c=passCount(3,1001,2);
		System.out.println(c);
		
	}
	 public static int passCount(int input1,int input2,int input3)
	    {
	     int n=input1;
	     int max=input2;
	     int l=input3;
	     if(n<3 || n>1000)  return -1;
	     if(max<3 || max>1000)  return -1;
	     int player[]=new int[n];
	      int p=0;
	      int count=0;
	      while(player[p]<max){
	    	  int ind=0;
	    	  if(player[p]%2==0){  //even pass to left
	            ind=pass(p,l,1,n);
	    	  }
	    	  if(player[p]%2==1){  //even pass to right
		            ind=pass(p,l,0,n);
		    	  }
	    	  player[p]++;
	    	  if(player[p]==max) break;
	    	   count++;
	    	 // System.out.print(p+1+"$"+count+"   ");
	    	  p=ind;
	    	 // System.out.println();
	    	  
	    	 
	    	  
	      }
	      
		 return count;
	    }
	  public static int pass(int index,int l,int r,int n){
		  if(r==0){// pass it to right
	        
	        	  return(index+l)%n;
	         }
		  
		  else {   // pass it to left
			  return (index+n-l)%n;
		  }

       }
}
