package basic_programs;

import java.util.Scanner;

public class Modulo_Equalto 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value");
		
		int a = sc.nextInt();
		
		a%=3;
		
		System.out.println(a);
		sc.close();
	}
}
