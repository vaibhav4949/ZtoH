package basic_programs;

import java.util.Scanner;

public class Multiplication_Two_Numbers 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value");
		
		int x = sc.nextInt();
		int y = sc.nextInt();


		int z;
		z=x*y;
		
		System.out.println("The Multiplication Of two number is = " + z);
		sc.close();
	}
}
