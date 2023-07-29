package basic_Logical_Programs;

import java.util.Scanner;

public class Even_Odd 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		
		int n = sc.nextInt();

		if(n%2==0)
		{
			System.out.println("The Number is Even");
		}

		else if(n%2!=0)
		{
			System.out.println("The number is Odd");
		}
            sc.close();
	}
}
