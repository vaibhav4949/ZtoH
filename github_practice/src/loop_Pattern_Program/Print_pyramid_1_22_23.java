package loop_Pattern_Program;

import java.util.Scanner;

public class Print_pyramid_1_22_23 
{
	public static void main(String[] args) 
	{
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter Your Rows");
	 int n = sc.nextInt();
	 
	 for(int r=1;r<=n;r++)
	 {
		 for(int s=1;s<=n-r;s++)
		 {
			 System.out.print(" ");
		 }
		 for(int c=r;c>0;c--)
		 {
			 System.out.print(c);
		 }
		 for(int t=2;t<=r;t++)
		 {
			 System.out.print(t);
		 }
		 System.out.println(" ");
	 }
	 sc.close();
	}
}
