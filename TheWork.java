import java.util.*;
import java.lang.*;
import java.io.*;
 

class WordCount
{
	public static void main (String[] args)  
	{
      Scanner sc=new Scanner(System.in);	  
      while(sc.hasNext()){		  
 	    int ct = sc.nextInt();
        int n  = sc.nextInt();
		int sum = 0;	
        for(int i = 0; i<n; i++){
			int p = sc.nextInt();
			sum += p;
		}
		int c = 1;
        if(sum == ct){
			System.out.println("Project will finish within " + c +" day.");
		}else{
			while(sum < ct){
				c++;
				sum += sum;
			}
			System.out.println("Project will finish within " + c +" days.");
			
		}		
		  
	  } 
	}
}