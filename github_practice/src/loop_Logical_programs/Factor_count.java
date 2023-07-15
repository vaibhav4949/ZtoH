package loop_Logical_programs;

import java.util.Scanner;

public class Factor_count 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Number");
		int n = sc.nextInt();
		
		System.out.println("The Factor Of " + n + " is");
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
		sc.close();
	}
}
