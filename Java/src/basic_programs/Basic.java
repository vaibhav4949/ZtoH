package basic_programs;

import java.util.Scanner;

public class Basic 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value");

		byte a = sc.nextByte();
		byte b = sc.nextByte();

		byte add = (byte)(a + b);    // Type casting.
		System.out.println("The Addition Of A&B is = " + add);

		byte prod = (byte)(a*b);    // Type Casting.
		System.out.println("The Multiplication Of A&B is = " + prod);

		sc.close();	
	}
}
