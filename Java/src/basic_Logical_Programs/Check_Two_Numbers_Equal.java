package basic_Logical_Programs;

import java.util.Scanner;

public class Check_Two_Numbers_Equal 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Value");
		
		int n1 = sc.nextInt();
		System.out.println("Enter The First Value");
		
		int n2 = sc.nextInt();

		if(n1==n2)
		{
			System.out.println("The Given Two Numbers Are Equal");
		}

		else
		{
			System.out.println("The Given Two Numbers Are Not Equal");
		}
		
		sc.close();
	}
}
