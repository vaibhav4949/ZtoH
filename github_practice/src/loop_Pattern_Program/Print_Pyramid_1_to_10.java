package loop_Pattern_Program;

import java.util.Scanner;

public class Print_Pyramid_1_to_10 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Rows");
		int n =sc.nextInt();
		
		int count =0;
		
		for(int r=1;r<=n;r++)
		{
			for(int s=0;s<=n-r;s++)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++)
			{
				count++;
				System.out.print(count+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
