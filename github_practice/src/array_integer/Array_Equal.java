package array_integer;

import java.util.Scanner;

public class Array_Equal 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Array Size");		
		int s1 = sc.nextInt();

		System.out.println("Enter Sencond Arrray Size");
		int s2 = sc.nextInt();

		int count =0;

		if(s1==s2)
		{
			int arr1[] = new int[s1]; 
			System.out.println("Enter First Array Elements");

			for(int i=0;i<arr1.length;i++)
			{
				arr1[i] = sc.nextInt();
			}

			int arr2[] = new int[s2];
			System.out.println("Enter Second Array Elements");

			for(int j=0;j<arr2.length;j++)
			{
				arr2[j] = sc.nextInt();
			}

			for(int k=0;k<arr1.length;k++)
			{
				if(arr1[k]==arr2[k])
				{
					count++;
				}
			}
			if(count==arr1.length)
			{
				System.out.println("Elements of Array1 & Array2 is Equal");
			}
			else
			{
				System.out.println("Elements of Array1 & Array2 is Not Equal");
			}
		}
		else
		{
			System.out.println("Size Of Array is Not Equal");
		}
		sc.close();
	}
}
