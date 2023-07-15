package loop_Logical_programs;

import java.util.Scanner;

public class One_Number_Power 
{
	public static void main(String[]args) 
	{
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter Your Number");
	  int num = sc.nextInt();
	  
	  System.out.println("Enter Raised to Power");
      int po = sc.nextInt();
      
      int total = 1;
      
      for(int i=1;i<=po;i++)
      {
    	  total = total*num;
      }
      System.out.println("The Power Of " + num + " is " + total); 
      sc.close();
	}	
}
