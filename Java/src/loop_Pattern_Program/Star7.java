package loop_Pattern_Program;

import java.util.Scanner;

public class Star7 
{
	public static void main(String[]args) 
	{
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter Your Row");
      int n = sc.nextInt();
      
      for(int r =1;r<=n;r++)
      {
    	  for(int c=1;c<=n;c++)
    	  {
    		  System.out.print("* ");
    	  }
    	  System.out.println();
      }
      sc.close();
	}
}
