package loop_Logical_programs;

import java.util.Scanner;

public class Fibonacci_Series 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Number");
		int n = sc.nextInt();

		int a = 0,b=1,c=0;

		for(int i=0;i<=n;i++)
		{
			if(c<=n)
			{
				c=a+b;
				a=b;
				b=c;

				System.out.print(c + ",");
			}
		}
		sc.close();
	}
}
