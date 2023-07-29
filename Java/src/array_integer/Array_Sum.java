package array_integer;

import java.util.Scanner;

public class Array_Sum 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Array Size");      
		int size = sc.nextInt();

		int arr[] = new int[size];                       

		System.out.println("Enter the Elements");
		int sum=0;

		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();                    

		}
		for(int i=0;i<size;i++)
		{
			sum=sum+arr[i];			
		}
		System.out.println(sum);
		sc.close();
	}
}
