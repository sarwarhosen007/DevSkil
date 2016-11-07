
import java.util.*;
import java.lang.*;
import java.io.*;


class DCP_117
{
	public static void main (String[] args)  
	{
      Scanner sc=new Scanner(System.in);
      int t = sc.nextInt();
	  int[] arr = new int[t];
	  for(int i = 0; i<t; i++){
		  int x=sc.nextInt();
		  int result = 0;
		   for(int j = 1; j<=x; j++){
			   result = result + j;
		   }
		   arr[i] = result;
	  }
	  for(int i = 0; i<t; i++){
		  System.out.println(arr[i]);
	  } 
  
    
	 
	 
	 
	}
}