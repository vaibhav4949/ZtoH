package array_integer;

import java.util.Scanner;

public class Addition_Two_Array_Horizontal 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size OF First Array");      
		int s1 = sc.nextInt();

		System.out.println("Enter the Size OF Second Array");
		int s2 = sc.nextInt();

		int sum1=0,sum2=0,add=0;

		if(s1==s2)
		{
			System.out.println("Enter First Array Elements");

			int arr1[] = new int[s1];

			for(int i=0;i<arr1.length;i++)
			{
				arr1[i] = sc.nextInt();
				sum1=sum1+arr1[i];
			}

			System.out.println("Enter Second Array Elements");
			int arr2[] = new int[s2];

			for(int j=0;j<arr2.length;j++)
			{			
				arr2[j] = sc.nextInt();
				sum2=sum2+arr2[j];
			}

			add = sum1+sum2;								
			System.out.println("The Addition Of Two Array is " + add);
		}
		else
		{
			System.out.println("The Size Of array is not match");
		}
		sc.close();
	}
}
