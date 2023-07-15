package loop_Logical_programs;

import java.util.Scanner;

public class Reverse_number 
{
	public static void main(String[]args) 
	{
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter Your Number");
	  int n = sc.nextInt();
	  int temp = n ,mod,move=0;
	  
	   while(temp>0)
	   {
		 mod =temp%10;	 
		 move = (move*10)+mod;		 	
		 temp = temp/10;		 
	   }
	   System.out.println("The Reverse Number Of " + n + " is " + move);
	   sc.close();
	}
}
