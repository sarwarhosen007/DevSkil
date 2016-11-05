 
 
import java.util.*;
import java.lang.*;
import java.io.*;


class PosSystem
{
	public static void main (String[] args)  
	{
      Scanner sc=new Scanner(System.in);
      int t = sc.nextInt();
	  
	  for(int i = 0; i<t; i++){
		  int n = sc.nextInt();
		  double p;
		  int q;
		  double result = 0;
		  for(int j = 0; j<n; j++){
			  p    = sc.nextDouble();
			  q    = sc.nextInt();
			  double temp = p*q;
			  result = result +  temp;
			  
		  }
		  int g = sc.nextInt();
		  System.out.println("Case " + (i+1) + ": " +(int)(g - result));
             		  
	  }
	  
	  
 
    
	 
	 
	 
	}
}