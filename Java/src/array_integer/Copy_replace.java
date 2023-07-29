package array_integer;

import java.util.Scanner;

public class Copy_replace 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Size Of Array");	  
		int n =sc.nextInt();

		System.out.println("Enter the Elements");
		int arr[] = new int[n];

		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int arr1[] = new int[n];

		for(int i=0;i<n;i++)
		{
			arr1[i] = arr[i];  
		}

		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		sc.close();
	}
}
