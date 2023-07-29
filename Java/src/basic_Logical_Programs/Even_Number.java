package basic_Logical_Programs;

import java.util.Scanner;

public class Even_Number 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Tell Me Your Number");
		
		int a = sc.nextInt();

		if(a%2==0)
		{
			System.out.println("The number is Even Number"); 
		}

		else 
		{
			System.out.println("The number is not Even");
		}
		sc.close();
	}
}
