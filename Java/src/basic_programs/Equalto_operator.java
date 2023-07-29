package basic_programs;

import java.util.Scanner;

public class Equalto_operator 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value");

		int x = sc.nextInt();
		int y = sc.nextInt();

		System.out.println(x==y);    // Equal to
		System.out.println(x>=y);   // Greater than equal to
		System.out.println(y>x);   // Greater than
		System.out.println(x<y);  // Less than

		sc.close();
	}
}
