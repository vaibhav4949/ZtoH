package array_integer;

import java.util.Scanner;

public class Print_Palindrom 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size Of Array");	  
		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter The Elements OF Array");
		int k=arr.length-1;
		int count =0;

		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();

		}

		for(int j=0;j<size;j++)
		{

			if(arr[j]==arr[k])
			{
				count++;
			}
			k--;
		}
		if(count==size)
		{
			System.out.println("The Given array is Palindrome");
		}
		else
		{
			System.out.println("The Given Array is Not Palindrome");
		}
		sc.close();
	}
}
