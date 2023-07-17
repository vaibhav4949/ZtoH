package array_integer;

import java.util.Scanner;

public class Addition_Two_Array_Vertical 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size Of First Array");
		int s1 = sc.nextInt();

		System.out.println("Enter the Size OF Second Array");
		int s2 = sc.nextInt();

		if(s1==s2)
		{
			System.out.println("Enter First array Element");
			int arr1[] = new int[s1];

			for(int i=0;i<arr1.length;i++)
			{
				arr1[i] = sc.nextInt();
			}

			System.out.println("Enter Second array Element");			
			int arr2[] = new int [s2];

			for(int j=0;j<arr2.length;j++)
			{
				arr2[j] = sc.nextInt();
			}

			int arr3[] = new int[arr1.length];

			for(int k=0;k<arr1.length;k++)
			{
				arr3[k] = arr1[k] + arr2[k];
			}

			for(int l=0;l<s1;l++)
			{
				System.out.println(arr3[l] + " ");
			}
		}
		else
		{
			System.out.println("The Array Sie is Not Equal");
		}
		sc.close();
	}
}
