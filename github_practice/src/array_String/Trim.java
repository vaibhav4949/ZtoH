package array_String;

import java.util.Scanner;

public class Trim 
{
	public static void main(String[]args)        // It will remove starting and last space.
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The String");
		String s = sc.nextLine();

		char c [] = s.toCharArray();
		String s1 = "";

		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=' ')
			{
				for(int j=i;j<c.length;j++)
				{
					s1 = s1+c[j];
				}
				break;
			}
		}
		char a1[] = s1.toCharArray();
		String temp  = "";

		for(int i=a1.length-1;i>=0;i--)
		{
			if(a1[i]!=' ')
			{
				for(int j=i;j>=0;j--)
				{
					temp = a1[j] + temp;
				}
				break;
			}
		}
		System.out.println(temp);
		sc.close();
	}
}
