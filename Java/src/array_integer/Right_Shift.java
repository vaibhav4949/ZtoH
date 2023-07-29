package array_integer;

import java.util.Scanner;

public class Right_Shift 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size Of Array");
		int n = sc.nextInt();	

		System.out.println("Enter the Elements Of Array");
		int arr[] = new int[n];

		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}

		int temp = arr[n-1];

		for(int j=n-1;j>0;j--)
		{
			arr[j] = arr[j-1];
		}
		arr[0]=temp;

		for(int k=0;k<n;k++)
		{
			System.out.print(arr[k]+" ");
		}
		sc.close();
	}
}
