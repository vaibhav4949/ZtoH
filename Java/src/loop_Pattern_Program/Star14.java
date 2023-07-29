package loop_Pattern_Program;

import java.util.Scanner;

public class Star14 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Rows");
		int n = sc.nextInt();

		for(int r=0;r<=n;r++)
		{
			for(int c=0;c<=n-r;c++)
			{
				System.out.print("* ");
			}
			System.out.println();

			for(int s=0;s<=r;s++)
			{
				System.out.print(" ");
			}			
		}
		sc.close();
	}
}
