package basic_Logical_Programs;

import java.util.Scanner;

public class Student_Attendance 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Classes Held");
		int ch = sc.nextInt();

		System.out.println("Enter Classes Attended");
		int ca = sc.nextInt();

		float attend = 100*ca/ch;
		System.out.println("Your Attendence is = " + attend);

		if (attend>75)
		{
			System.out.println("You are Eligible For Exam");
		}

		else
		{
			System.out.println("You are not Eligible for exam");

		}
		sc.close();
	}
}
