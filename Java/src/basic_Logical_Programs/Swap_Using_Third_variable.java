package basic_Logical_Programs;

import java.util.Scanner;

public class Swap_Using_Third_variable 
{
	public static void main(String[]args) 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the Value");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c  = a;

		a = b;
		b = c;
		
		System.out.println("The Value Of A is = " + a);
		System.out.println("The Value Of B is = " + b);
		sc.close();
	}
}
