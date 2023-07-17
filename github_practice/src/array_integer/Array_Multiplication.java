package array_integer;

import java.util.Scanner;

public class Array_Multiplication 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Array Size");

		int size = sc.nextInt();

		int arr[] = new int[size];
		int mul = 1;

		System.out.println("Enter Your Elements");

		for(int i =0;i<size;i++)
		{
			arr[i] = sc.nextInt();
			mul=mul*arr[i];
		}
		System.out.println("The Multiplication OF Given Array is " + mul);
		sc.close();
	}
}
