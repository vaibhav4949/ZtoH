package basic_programs;

import java.util.Scanner;

public class Not_Equal_operator 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a!=b);
		sc.close();
	}
}
