package loop_Pattern_Program;

import java.util.Scanner;

public class Print_reverse_1234 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Rows");
		int n = sc.nextInt();

		for(int r=n;r>=1;r--)
		{
			for(int s=1;s<=n-r;s++)
			{
				System.out.print(" ");
			}

			for(int c=1;c<=r;c++)
			{
				System.out.print(r);              
			}
			System.out.println();
		}
		sc.close();
	}
}
