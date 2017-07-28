package practice;

import java.util.ArrayList;

public class Monkey {

	 static ArrayList<String> List=new ArrayList<String>();
	 //static ArrayList<Integer> colC=new ArrayList<Integer>();
	 static int Max=0;;
	public static void main(String args[]){
		String astr="((2,1),(6,6),(4,2),(2,5),(2,6),(2,7),(3,4),(6,1),(6,2),(2,3),(6,3),(6,4),(6,5),(6,7))";
				maxTreeDistroyed(6,7,14,astr);
				//System.out.println(List);

	System.out.println(Max);
	}
  public static int maxTreeDistroyed(int input1,int input2,int input3,String input4){
	  int row=input1;
	  int col=input2;
	  int distroyed=input3;
	 MakeArrayList(input4);
	  int count=0;
	  while(count<distroyed){
		String s=List.get(count);
		//System.out.println(s);
		char s1[]=s.toCharArray();
		//System.out.println(s1);
	    int r=(int)s1[0]-'0';
	    int c=(int)s1[2]-'0';
	    
		  ////System.out.println(r+"  "+c+" max= "+Max);
		 // goDown(r,c,distroyed,row,col);
		 
		 // goUp(r,c,distroyed,row,col);
		  for(int i=1;i<distroyed;i++){
		  goRight(r,c,distroyed,row,col,i);
		  }
		  for(int i=1;i<distroyed;i++){
			  goLeft(r,c,distroyed,row,col,i);
			  }
		  for(int i=1;i<distroyed;i++){
			  goUp(r,c,distroyed,row,col,i);
			  }
		  for(int i=1;i<distroyed;i++){
			 // goDown(r,c,distroyed,row,col,i);
			  }
		  for(int i=1;i<distroyed;i++){
			 go1(r,c,distroyed,row,col,i);
			  }
		  for(int i=1;i<distroyed;i++){
				  go2(r,c,distroyed,row,col,i);
			  }
		  for(int i=1;i<distroyed;i++){
			 go3(r,c,distroyed,row,col,i);
			  }
		  for(int i=1;i<distroyed;i++){
			  go4(r,c,distroyed,row,col,i);
			  }
		  //goLeft(i,j);
		  //goCross(i,j)*/;
		  
		  count++;
		  	  
	 }
	  
	  return Max;
	  
	 
  }
  static void goLeft(int r,int c,int maxGo,int row,int col,int step){
		 // //System.out.println("****"+step+"**********************"+r+"********"+c);
		  int tempMax=1;
		 
			  int nr=r;
			  int nc=c-step;
	     while (nr>0 && nr<=row && nc>0 && nc<=col){
	    	 String s=nr+"|"+nc;
	    	 if(List.contains(s)){
	       // //System.out.println(""+r+","+c+ "matched to" +s +"at dist"+step);
	         nr=r;
	         nc=nc-step;
	         tempMax++;
	         if(tempMax>Max){
	        	 Max=tempMax;
	         }
	        	 
	    	 }
	    	 else
	    		 break;
	    	 
	     }
			  
		  	  
	  }
  static void goRight(int r,int c,int maxGo,int row,int col,int step){
	 // //System.out.println("****"+step+"**********************"+r+"********"+c);
	  int tempMax=1;
	 
		  int nr=r;
		  int nc=c+step;
     while (nr>0 && nr<=row && nc>0 && nc<=col){
    	 String s=nr+"|"+nc;
    	 if(List.contains(s)){
       // //System.out.println(""+r+","+c+ "matched to" +s +"at dist"+step);
         nr=r;
         nc=nc+step;
         tempMax++;
         if(tempMax>Max){
        	 Max=tempMax;
         }
        	 
    	 }
    	 else
    		 break;
    	 
     }
		  
	  	  
  }
  
  static void goUp(int r,int c,int maxGo,int row,int col,int step){
		 // //System.out.println("****"+step+"**********************"+r+"********"+c);
		  int tempMax=1;
		 
			  int nr=r-step;
			  int nc=c;
	     while (nr>0 && nr<=row && nc>0 && nc<=col){
	    	 String s=nr+"|"+nc;
	    	 if(List.contains(s)){
	       // //System.out.println(""+r+","+c+ "matched to" +s +"at dist"+step);
	         nr=nr-step;
	         nc=nc;
	         tempMax++;
	         if(tempMax>Max){
	        	 Max=tempMax;
	         }
	        	 
	    	 }
	    	 else
	    		 break;
	    	 
	     }
			  
		  	  
	  }
  static void goDown(int r,int c,int maxGo,int row,int col,int step){
		 // //System.out.println("****"+step+"**********************"+r+"********"+c);
		  int tempMax=1;
		 
			  int nr=0;
			  nr=r+step;
			  int nc=c;
	     while (nr>0 && nr<=row && nc>0 && nc<=col){
	    	 String s=nr+"|"+nc;
	    	 if(List.contains(s)){
	       // //System.out.println(""+r+","+c+ "matched to" +s +"at dist"+step);
	         nr=nr+step;
	         nc=nc;
	         tempMax++;
	         if(tempMax>Max){
	        	 Max=tempMax;
	         }
	        	 
	    	 }
	    	 else
	    		 break;
	    	 
	     }
			  
		  	  
	  }
  
  static void go1(int r,int c,int maxGo,int row,int col,int step){
		 // //System.out.println("****"+step+"**********************"+r+"********"+c);
		  int tempMax=1;
		 
			  int nr=r-step;
			  int nc=c-step;
	     while (nr>0 && nr<=row && nc>0 && nc<=col){
	    	 String s=nr+"|"+nc;
	    	 if(List.contains(s)){
	       // //System.out.println(""+r+","+c+ "matched to" +s +"at dist"+step);
	         nr=r-step;
	         nc=nc-step;
	         tempMax++;
	         if(tempMax>Max){
	        	 Max=tempMax;
	         }
	        	 
	    	 }
	    	 else
	    		 break;
	    	 
	     }
			  
		  	  
	  }
  static void go2(int r,int c,int maxGo,int row,int col,int step){
		 // //System.out.println("****"+step+"**********************"+r+"********"+c);
		  int tempMax=1;
		 
			  int nr=r-step;
			  int nc=c+step;
	     while (nr>0 && nr<=row && nc>0 && nc<=col){
	    	 String s=nr+"|"+nc;
	    	 if(List.contains(s)){
	       // //System.out.println(""+r+","+c+ "matched to" +s +"at dist"+step);
	         nr=r-step;
	         nc=nc+step;
	         tempMax++;
	         if(tempMax>Max){
	        	 Max=tempMax;
	         }
	        	 
	    	 }
	    	 else
	    		 break;
	    	 
	     }
			  
		  	  
	  }
  static void go3(int r,int c,int maxGo,int row,int col,int step){
		 // //System.out.println("****"+step+"**********************"+r+"********"+c);
		  int tempMax=1;
		 
			  int nr=r+step;
			  int nc=c-step;
	     while (nr>0 && nr<=row && nc>0 && nc<=col){
	    	 String s=nr+"|"+nc;
	    	 if(List.contains(s)){
	       // //System.out.println(""+r+","+c+ "matched to" +s +"at dist"+step);
	         nr=r+step;
	         nc=nc-step;
	         tempMax++;
	         if(tempMax>Max){
	        	 Max=tempMax;
	         }
	        	 
	    	 }
	    	 else
	    		 break;
	    	 
	     }
			  
		  	  
	  }
  static void go4(int r,int c,int maxGo,int row,int col,int step){
		 // //System.out.println("****"+step+"**********************"+r+"********"+c);
		  int tempMax=1;
		 
			  int nr=r-step;
			  int nc=c+step;
	     while (nr>0 && nr<=row && nc>0 && nc<=col){
	    	 String s=nr+"|"+nc;
	    	 if(List.contains(s)){
	       // //System.out.println(""+r+","+c+ "matched to" +s +"at dist"+step);
	         nr=r-step;
	         nc=nc+step;
	         tempMax++;
	         if(tempMax>Max){
	        	 Max=tempMax;
	         }
	        	 
	    	 }
	    	 else
	    		 break;
	    	 
	     }
			  
		  	  
	  }

  
  static void MakeArrayList(String str){
	  char mat[]=str.toCharArray();
	  int count=0;
	  String s="";
	  for(int i=0;i<mat.length;i++){
		 
		  if(mat[i]>='0'&& mat[i]<='9'){
			  
			  if(count%2==0){
					 s="";
				  int k=mat[i]-'0';
				  s=s+k+"|";
				  
				  count++;
			  }
			  else{ 
				  //colC.add((int)(mat[i]-'0'));
				  int k=mat[i]-'0';
				  s=s+k;
				  count++;
				  List.add(s);
			  }
			  
			  
			  
			 
		  }
		  
		  
	  }  
 }
	
}