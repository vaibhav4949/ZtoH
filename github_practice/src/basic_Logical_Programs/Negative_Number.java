package basic_Logical_Programs;

import java.util.Scanner;

public class Negative_Number 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Tell Me Your Number");
		
		int n = sc.nextInt();
		
		if(n<0)
		{
			System.out.println("The number is Negative");
		}
		else {
			System.out.println("The number is not Negative");
		}		
		sc.close();
	}
}
