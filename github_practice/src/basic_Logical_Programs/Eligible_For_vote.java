package basic_Logical_Programs;

import java.util.Scanner;

public class Eligible_For_vote 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Age");		
		int age = sc.nextInt();

		System.out.println("Tell Me About Your id card");
		String id = sc.next();
		
		if(age >=18 && id.equals("Aadhar"))
		{
			System.out.println("You are Eligible For Voting");
		}

		else 
		{
			System.out.println("You are not eligible For Voting");
		}
		sc.close();
	}
}
