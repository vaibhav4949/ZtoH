package array_String;

import java.util.Scanner;

public class Check_Middle_Substring 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String");
		String cv = sc.nextLine();
		char arr[] = cv.toCharArray();

		System.out.println("Enter Sub String");
		String cs = sc.nextLine();
		char arr1[] = cs.toCharArray();

		int count =0;

		for(int i=0;i<arr.length;i++)
		{       	
			count=0;
			if(arr[i]==arr1[0])
			{
				int k=i;
				for(int j=0;j<arr1.length;j++)
				{
					if(arr[k]==arr1[j])
					{
						count++;
						k++;
					}
					else
					{
						break;
					}
				}
				if(count==arr1.length)
				{
					break;
				}
			}
		}
		if(count==arr1.length)
		{
			System.out.println("Sub String");
		}
		else
		{
			System.out.println("Not Substring");
		}
		sc.close();
	}
}
