package basic_Logical_Programs;

import java.util.Scanner;

public class Odd_Number 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if(n%2!=0)
		{
			System.out.println("The Number is odd no");
		}

		else 
		{
			System.out.println("The Number is Not Odd");
		}
		sc.close();
	}
}
