package loop_Logical_programs;

import java.util.Scanner;

public class Multiplication_Table 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Number");
		int n =sc.nextInt();
		
		int table;
		System.out.println("The Multiplication table Of " + n + " is ");
		
		for(int i=1;i<=10;i++)
		{
			table =n*i;
			System.out.println(n + " * " + i + " = " + table);
		} 
		sc.close();
	}
}
