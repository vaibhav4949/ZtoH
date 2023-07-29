package basic_Logical_Programs;

import java.util.Scanner;

public class Leap_year 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Year");
		
		int year = sc.nextInt();
		
		if(year%4==0)
		{
			System.out.println("This Year is Leap Year");
		}
		
		else
		{
			System.out.println("This is Not Leap Year");
		}		
		sc.close();
	}
}
