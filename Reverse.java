
import java.util.*;
import java.lang.*;
import java.io.*;


class Reverse
{
	public static void main (String[] args)  
	{
      Scanner sc=new Scanner(System.in);
      int t = sc.nextInt();
	  String[] arr = new String[t];
	  for(int i = 0; i<t; i++){
		  arr[i] = sc.nextLine();
		  
	  }
	  for(int i = 0; i<t; i++){
		  String temp = arr[i];
		  int l = temp.length();
		  while(l != 0){
			  System.out.print(temp.charAt(l-1));
			  l--;
		  }
	  }
	   
  
    
	 
	 
	 
	}
}