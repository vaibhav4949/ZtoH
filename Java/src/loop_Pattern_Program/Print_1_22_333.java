package loop_Pattern_Program;

import java.util.Scanner;

public class Print_1_22_333 
{
	public static void main(String[]args) 
	{
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter Your Number");
	  int n = sc.nextInt();
	  
	  for(int r=1;r<=n;r++)
	  {
		  for(int s=0;s<=n-r;s++)
		  {
			  System.out.print(" ");
		  }
		  for(int c=1;c<=r;c++)
		  {
			  System.out.print(r+" ");
		  }
		  System.out.println();		  
	  }
	  sc.close();
	}
}
