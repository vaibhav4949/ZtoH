package basic_Logical_Programs;

import java.util.Scanner;

public class Company_Bonus 
{	
		public static void main(String[]args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Year");
			
			int year = sc.nextInt(); 
			System.out.println("Enter the Salary");
			
			int salary = sc.nextInt(); 
			int tb;
			
			if(year>5)
			{
				 tb = 5*(salary/100);
				 
				 System.out.println("You are eligible for bonus");
				 System.out.println("The bonus is = " + tb);
				 System.out.println("Total Salary and Bonus =" + (salary+tb));
			}
			
			else
			{
				System.out.println("Not eligible for bonus");
			}			
			sc.close();		
	}
}
