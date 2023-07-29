package basic_Logical_Programs;

import java.util.Scanner;

public class Check_positive_Number 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Tell Me About Your Number");
		
		int n = sc.nextInt();
		
		if(n>0)
		{
			System.out.println("The given value is Positive");
		}
		else {
			System.out.println("The given value is not Positive");
		}
		   sc.close();		   
	}
}
