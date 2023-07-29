package basic_programs;

import java.util.Scanner;

public class Multiplication_Or_Equal 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value");
		
		int a = sc.nextInt();
		a *=4;
		
		System.out.println("The Multiplication is = " + a);
		sc.close();
	}
}
