package array_integer;

import java.util.Scanner;

public class Add_Last_Index 
{

	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size Of Array");	  
		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter The Elements");

		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter The New Element");
		int ele = sc.nextInt();

		for(int j =0;j<size-1;j++)
		{
			arr[j] = arr[j+1];
		}
		arr[size-1] = ele;

		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		sc.close();
	}
}
