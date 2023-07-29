package loop_Logical_programs;

import java.util.Scanner;

public class Perfect_Number 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Number");
		int n = sc.nextInt();
		int count = 0;

		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				count = count+i;
			}
		}
		if(count==n)
		{
			System.out.println("The Number is Perfect Number");
		}

		else
		{
			System.out.println("The Number is Not Perfect Number");
		}
		sc.close();
	}
}
