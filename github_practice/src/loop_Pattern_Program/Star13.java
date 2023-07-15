package loop_Pattern_Program;

import java.util.Scanner;

public class Star13 
{
	public static void main(String[]args) 
	{
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter Your Rows");
      int n = sc.nextInt();
      
      for(int r=1;r<=n;r++)
      {
    	for(int c=1;c<=r;c++)
    	{
    		System.out.print(r);
    	}
    	System.out.println();
      }
      sc.close();
	}
}
