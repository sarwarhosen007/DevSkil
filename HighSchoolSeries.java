
import java.util.*;
import java.lang.*;
import java.io.*;


class HighSchoolSeries
{
	public static void main (String[] args)  
	{
      Scanner sc=new Scanner(System.in);
      int t = sc.nextInt();
	  int[] arr = new int[t];
	  for(int i = 0; i<t; i++){
		 arr[i] = sc.nextInt();
        		
	  }
	  
	  for(int i = 0; i<t; i++){
		  int j = arr[i];
		  int result = 0;
		  for(int k = 1; k<=j; k++){
			   int temp = (int)(Math.pow(k,3));
			  
			   result = result + temp;
		  }
		  System.out.println("Case " + (i+1) + ": " + result);
		   		  
	  }
    
	 
	 
	 
	}
}