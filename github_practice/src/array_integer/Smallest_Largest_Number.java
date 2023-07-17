package array_integer;

import java.util.Scanner;

public class Smallest_Largest_Number 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Size Of Array");		
		int n = sc.nextInt();
		int arr[] = new int[n];

		System.out.println("Enter The Elements Of Array");

		for(int i =0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		int small = arr[0];
		int large = arr[0];

		for(int i=1;i<arr.length;i++)
		{
			if(small>arr[i])
			{
				small = arr[i];
			}
			else if(large<arr[i])
			{
				large = arr[i];
			}
		}

		//		for(int i=0;i<arr.length;i++)
		//		{
		//			arr[i] = sc.nextInt();
		//		}
		//		int large=0;
		//		int small=0;
		//
		//		for(int i=0;i<arr.length;i++)
		//		{
		//			for(int j=0;j<arr.length;j++)
		//			{
		//				if(arr[i]>arr[j])
		//				{
		//					large = arr[i];
		//				}
		//				if(arr[i]<arr[j])
		//				{
		//					small = arr[i];
		//				}
		//			}
		//		}
		System.out.println("The Smallest Number OF Given Array is " + small);
		System.out.println("The Largest Number OF Given Array is " + large);
		sc.close();
	}
}
