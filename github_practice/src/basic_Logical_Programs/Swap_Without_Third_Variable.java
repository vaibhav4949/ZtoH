package basic_Logical_Programs;

import java.util.Scanner;

public class Swap_Without_Third_Variable 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value");
		
		int a = sc.nextInt();
		int b = sc.nextInt();

		a = a+b;      // 14
		b = a-b;     // b = 14-8 = 6

		System.out.println("The Value of B is = " + b);   // 6
		
		a = a-b;   // a = 14-6 = 8
		
		System.out.println("The value of A is = " + a);
		sc.close();
	}
}
