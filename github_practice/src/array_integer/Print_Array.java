package array_integer;

import java.util.Scanner;

public class Print_Array 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size Of Array");

		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter Your Elements");

		for(int i = 0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		sc.close();
	}
}
