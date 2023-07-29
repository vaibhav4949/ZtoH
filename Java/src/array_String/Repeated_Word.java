package array_String;

import java.util.Scanner;

public class Repeated_Word 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String");		
		String cv = sc.nextLine();
		char arr[] = cv.toCharArray();

		System.out.println("Enter Word");
		String cs = sc.next();
		char arr1[] = cs.toCharArray();

		int count,count1=0;

		for(int i=0;i<arr.length;i++)
		{
			count=0;
			for(int j=0;j<arr1.length;j++)
			{
				if(arr[i+j]==arr1[j])
				{
					count++;
				}
				else
				{
					break;
				}
				if(count==arr1.length)
				{
					count1++;
				}
			}
		}
		System.out.println(count1);
		sc.close();
	}
}
