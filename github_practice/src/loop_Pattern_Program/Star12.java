package loop_Pattern_Program;

import java.util.Scanner;

public class Star12 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Rows");

		int n = sc.nextInt();
		int count =0;

		for(int r=1;r<=n;r++)              // Row
		{
			for(int s=1;s<=n-r;s++)      // Space
			{
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++)       // Column
			{
				count++;
				System.out.print(count +" "); 
			}
			System.out.println();
		}
		sc.close();
	}
}
