package basic_Logical_Programs;

import java.util.Scanner;

public class Positive_negative_zero 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Tell me Your Number");
		
		int n = sc.nextInt();
	  
	  if(n>0)
	  {
		  System.out.println("The number is Positive");
	  }
	  
	  else if(n<0)
	  {
		  System.out.println("The number is Negative ");
	  }
	  
	  else {
		  System.out.println("The Number is Zero");
	  }
	     sc.close();
	}
}
