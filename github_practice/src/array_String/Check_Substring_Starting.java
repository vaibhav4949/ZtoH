package array_String;

import java.util.Scanner;

public class Check_Substring_Starting 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The String");
		String s1 = sc.nextLine();
		char arr[] = s1.toCharArray();

		System.out.println("Enter the Substring");
		String s2 = sc.nextLine();
		char arr1[] = s2.toCharArray();

		int count=0;

		for(int i=0;i<arr1.length;i++)
		{
			if(arr[i]==arr1[i])
			{
				count++;
			}
		}

		if(count==arr1.length)
		{
			System.out.println("It is Substring");
		}
		else
		{
			System.out.println("Not Substring");
		}
		sc.close();
	}
}
