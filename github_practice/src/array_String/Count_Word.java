package array_String;

import java.util.Scanner;

public class Count_Word 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Words");
		String str = sc.nextLine();

		char arr[] = str.toCharArray();
		int count = 1;

		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==' ')
			{
				if(!(i==0||i==arr.length-1))
				{
					count++;
				}

				if(i!=(arr.length-1))
				{
					if(arr[i+1]==' ')
					{
						count--;
					}
				}
			}
		}
		System.out.println("The total Words is " + count);
		sc.close();
	}
}
