package array_String;

import java.util.Scanner;

public class Check_Substring_Ending 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String");
		String s1 = sc.nextLine();
		char arr[] = s1.toCharArray();

		System.out.println("Enter the Substring");
		String s2 = sc.nextLine();
		char arr1[] = s2.toCharArray();

		int count=0;
		int size = arr.length-1;

		for(int i=arr1.length-1;i>=0;i--)
		{			
			if(arr[size]==arr1[i])
			{
				count++;
				size--;
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
