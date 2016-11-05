/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Palindrome
{
	public static void main (String[] args)  
	{
      Scanner sc=new Scanner(System.in);
      int t = sc.nextInt();
	  String[] arr = new String[t];
	  for(int i = 0; i<t; i++){
		 arr[i] = sc.next();
        		
	  }
	  
     for(int i = 0; i<t; i++){
 
		 String s = arr[i];
		 int j = s.length();
		 String join = "";
		 while(j != 0){
			 //System.out.println(s.charAt(j-1));
			 char single = s.charAt(j-1);
             join = join + single;			 
			 j--;
		 }
		 if(s.equals(join)){
			 System.out.println("Yes");
		 }else{
			System.out.println("No"); 
		 }
	 }
	  
	 
	 
	 
	}
}