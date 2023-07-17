package array_integer;

import java.util.Scanner;

public class Reverse_Array 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Ente the Size of Array");
		int size = sc.nextInt();		
		int arr[] = new int[size];

		int temp =arr.length-1;

		System.out.println("Enter The Element");

		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}

		for(int i=0;i<arr.length/2;i++)
		{
			arr[i] = arr[temp]+arr[i];
			arr[temp] = arr[i]-arr[temp];
			arr[i] = arr[i]-arr[temp];

			temp--;
		}

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		sc.close();
	}
}
