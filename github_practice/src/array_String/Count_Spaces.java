package array_String;

import java.util.Scanner;

public class Count_Spaces 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Sentences");
		String cha = sc.nextLine();

		char arr[] = cha.toCharArray();
		int count =0;

		for(int i=0;i<cha.length();i++)
		{
			if(arr[i]==' ')
			{
				count++;
			}
		}
		System.out.println("The Spaces Of given Sentences is " + count);
		sc.close();
	}
}
