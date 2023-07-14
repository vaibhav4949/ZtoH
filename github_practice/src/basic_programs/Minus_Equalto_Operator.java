package basic_programs;

import java.util.Scanner;

public class Minus_Equalto_Operator 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value");
		
		int x = sc.nextInt();		
		x -= 5;
		System.out.println("The value of x is = " + x);
		sc.close();
	}
}
