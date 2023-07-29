package basic_programs;

import java.util.Scanner;

public class Modulus_OF_two_Numbers 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value");

		int a = sc.nextInt();
		int b = sc.nextInt();

		int c;

		c = a%b;

		System.out.println("The value of two modulus is = " + c);
		sc.close();
	}
}