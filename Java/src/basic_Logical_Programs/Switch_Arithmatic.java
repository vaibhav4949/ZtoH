package basic_Logical_Programs;

import java.util.Scanner;

public class Switch_Arithmatic 
{
	public static void main(String[]args) 
	{
		Scanner sc  = new Scanner(System.in);

		System.out.println("Enter Your First Number");
		int n1 = sc.nextInt();

		System.out.println("Enter Your Second Number");
		int n2 = sc.nextInt();

		System.out.println("Enter the number in between 1 to 5"); 
		int num = sc.nextInt();

		switch(num)
		{
		case 1 : int add = n1+n2;
		System.out.println("The Addition of n1&n2 is =" +add); break;

		case 2 : int sub = n1-n2;
		System.out.println("The Substraction of n1&n2 is =" +sub); break;

		case 3 : int mul = n1*n2;
		System.out.println("The Multiplication of n1&n2 is =" + mul); break;

		case 4 : int div = n1/n2;
		System.out.println("The Divison of n1&n2 is =" + div); break;

		case 5 : int mod = n1%n2;
		System.out.println("The Modulus of n1&n2 is =" + mod); break;

		default : System.out.println("Enter Valid Number");
		}
		sc.close();
	}
}
