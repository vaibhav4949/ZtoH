package array_String;

import java.util.Scanner;

public class Remove_Character 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String");
		String str = sc.nextLine();

		char arr[] = str.toCharArray();
		System.out.println("Enter Which character you want to remove");

		char ch  =sc.next().charAt(0);

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ch)
			{
				System.out.print("");
			}
			else
			{
				System.out.print(arr[i]);
			}
		}
		sc.close();
	}
}
