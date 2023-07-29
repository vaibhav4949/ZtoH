package array_integer;

import java.util.Scanner;

public class Left_Shift 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Size Of Array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the Elements");		
			
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int temp = arr[0];

		for(int j=0;j<n-1;j++)
		{
			arr[j] = arr[j+1];
		}
		arr[n-1] = temp;

		for(int k=0;k<n;k++)
		{
			System.out.print(arr[k] +" ");
		}
		sc.close();
	}
}
