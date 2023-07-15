package loop_Pattern_Program;

import java.util.Scanner;

public class Star9 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Rows");
		
		int n = sc.nextInt();
		
		int count = 0;
		
		for(int r=1;r<=n;r++)
		{
			for(int c=1;c<=r;c++)
			{
				count++;
				System.out.print(" " + count);
			}
			System.out.println();
		}
		sc.close();
	}
}
