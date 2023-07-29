package array_integer;

import java.util.Scanner;

public class Array_Avarage 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Size");

		int size = sc.nextInt();

		int arr[] = new int[size];
		int sum=0,avg;

		System.out.println("Enter Your Elements");

		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt(); 
			sum=sum+arr[i];
		}		

		System.out.println("The Sum OF Given Elements is " + sum);

		avg = sum/size;
		System.out.println("The Avarage OF Given Elements is " + avg);

		sc.close();
	}
}
