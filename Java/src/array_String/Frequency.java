package array_String;

import java.util.Scanner;

public class Frequency 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The String");

		String cs = sc.nextLine();
		char arr[] = cs.toCharArray();

		int count;

		for(int i=0;i<arr.length;i++)
		{		
			count=0;				
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
				System.out.println(arr[i] + " " + count);
			}
			count=0;		
			sc.close();
		}
	}
}
