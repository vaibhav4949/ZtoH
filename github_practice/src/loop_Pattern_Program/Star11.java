package loop_Pattern_Program;

import java.util.Scanner;

public class Star11 
{
	public static void main(String[]args) 
	   {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter Your Rows");
		 int n = sc.nextInt();
		 
		 for(int r =0;r<=n;r++)
		 {
			 for(int c=n;c<=n-r;c--)
			 {
				 System.out.print(n);
			 }
			 System.out.println();		 
		 }
		 sc.close();
	   }
}
