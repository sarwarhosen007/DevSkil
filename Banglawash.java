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
		  int bt_1_e_1 = sc.nextInt();
		  int bt_1_e_2 = sc.nextInt();
		  
		  int pt_1_e_1 = sc.nextInt();
		  int pt_1_e_2 = sc.nextInt();
		  
		  int b_1_s = bt_1_e_1 + bt_1_e_2;
		  int p_1_s = pt_1_e_1 + pt_1_e_2;
		   
		  
		  int bt_2_e_1 = sc.nextInt();
		  int bt_2_e_2 = sc.nextInt();
		  
		  int pt_2_e_1 = sc.nextInt();
		  int pt_2_e_2 = sc.nextInt();
		  
		  int b_2_s = bt_2_e_1 + bt_2_e_2;
		  int p_2_s = pt_2_e_1 + pt_2_e_2;
		  if((b_1_s > p_1_s) && (b_2_s > p_2_s)){
			  System.out.println("Banglawash");
		  }else{
			  System.out.println("Miss");  
		  }
		  
	  } 
	}
}