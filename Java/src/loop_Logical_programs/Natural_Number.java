package loop_Logical_programs;

import java.util.Scanner;

public class Natural_Number 
{
	public static void main(String[]args) 
	{
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter Your Number");
	  int n = sc.nextInt();
	  int sum = 0;
	  
	  for(int i=1;i<=n;i++)
	  {
		sum = sum+i;  
	  }
	  
	  System.out.println("The Sum Of Given Natural Number Is " + sum);		  
	  sc.close();
	}	
}
