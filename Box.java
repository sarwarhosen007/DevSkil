import java.util.*;
import java.lang.*;
import java.io.*;
 

class WordCount
{
	public static void main (String[] args)  
	{
      Scanner sc=new Scanner(System.in);	  
       int t = sc.nextInt();
	   for(int i = 0; i<t; i++){
		   double AB = sc.nextDouble();
		   double BC = sc.nextDouble();
		   double CD = sc.nextDouble();
		   double AC = Math.sqrt(AB*AB + BC*BC);
		   //float AC = (float)Math.sqrt(s);
		   
		   double AD = Math.sqrt(AC*AC + CD*CD);
		   //float AD = (float)Math.sqrt(s2);
		   double rounded = (double) Math.round(AD * 100.0) / 100.0;
		   System.out.println(String.format("%.2f",rounded));
	   }
	}
}