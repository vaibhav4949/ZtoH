package array_String;

import java.util.Scanner;

public class Remove_Word 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String");
		String str1 = sc.nextLine();
		char arr1[] = str1.toCharArray();

		System.out.println("Enter Which word You want to remove");
		String str2 = sc.nextLine();
		char arr2[] = str2.toCharArray();

		int count =0,k;

		for(int i=0;i<arr1.length;i++)
		{
			count =0;
			if(arr1[i]==arr2[0])
			{
				k=i;
				for(int j=0;j<arr2.length;j++)
				{
					if(arr2[j]==arr1[k])
					{
						count++;
						k++;
					}
				}
				if(count==arr2.length)
				{
					for(int l=0;l<=arr2.length;l++)
					{
						for(int m=i;m<arr1.length-1;m++)
						{
							arr1[m]=arr1[m+1];
						}
					}
					count++;
				}
				break;
			}
		}
		for(int i=0;i<arr1.length-count;i++)
		{
			System.out.print(arr1[i]);
		}
		sc.close();
	}
}
