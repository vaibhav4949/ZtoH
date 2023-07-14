package basic_programs;

import java.util.Scanner;

public class Increment_Decrement 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value");
		
		int a = sc.nextInt();
  
		System.out.println(a++);   // 10(11)
		System.out.println(++a);   // 12
		System.out.println(a--);   // 12(11)
		System.out.println(--a);   // 10
		
		sc.close();
	}
}
