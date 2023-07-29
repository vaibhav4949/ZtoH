package array_String;

import java.util.Scanner;

public class Remove_Duplicates 
{

	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String");
		String str = sc.nextLine();

		char arr[] = str.toCharArray();
		int count =0;

		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					for(int k=i-1;k>=0;k--)
					{
						if(arr[k]==arr[i])
						{
							count--;
						}
					}
				}
			}
			if(count>0)
			{
				System.out.print(arr[i] + " ");
			}
			count=0;
			sc.close();
		}
	}
}
