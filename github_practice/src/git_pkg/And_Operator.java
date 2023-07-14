package git_pkg;

import java.util.Scanner;

public class And_Operator 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println();

		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(a<b && b>a); // True && True = True.
		System.out.println(b<a && a<b); // False && True = False.
		System.out.println(b<a && a>b); // false && False = False.
		System.out.println(a<b && a>b); // True && False = False.

		sc.close();
	}
}
