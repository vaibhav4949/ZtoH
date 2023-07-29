package array_integer;

import java.util.Scanner;

public class First_Index_Add 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size Of Array");
		int size = sc.nextInt();

		System.out.println("Enter the elements");
		int arr[] = new int[size];

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter Which element you want to Add in First Index");
		int ele = sc.nextInt();
        

		for(int i=size-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0] = ele;

		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		sc.close();
	}
}
