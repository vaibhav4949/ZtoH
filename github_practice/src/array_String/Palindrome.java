package array_String;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The String");
		String str = sc.nextLine();

		char arr[]  =str.toCharArray();
		int count = 0;

		int x = arr.length-1;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==arr[x])
			{
				count++;
			}
			x--;
		}
		if(count==arr.length)
		{
			System.out.println("The Given String is Palindrome");
		}
		else
		{
			System.out.println("The Given String is Not Palindrome");
		}
		sc.close();
	}
}
