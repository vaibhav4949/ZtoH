package array_String;

import java.util.Scanner;

public class Sorting_Small 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String");
		String str = sc.nextLine();

		char arr[] = str.toCharArray();
		char temp=0;

		for(int i=0;i<arr.length;i++)
		{
			for(int j =i+1;j<arr.length;j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int k =0;k<arr.length;k++)
		{
			if(arr[k]!=' ')
			{
				System.out.print(arr[k]);
			}
		}
		sc.close();	
	}
}
