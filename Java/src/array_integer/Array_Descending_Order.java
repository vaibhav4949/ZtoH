package array_integer;

import java.util.Scanner;

public class Array_Descending_Order 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size OF Array");
		int s = sc.nextInt();

		int arr[] = new int[s]; 
		int temp;

		System.out.println("Enter the Elements Of Array");

		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}
