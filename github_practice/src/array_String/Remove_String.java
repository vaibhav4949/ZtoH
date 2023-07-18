package array_String;

import java.util.Scanner;

public class Remove_String 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String");
		String str = sc.nextLine();
		char arr[] = str.toCharArray();
		sc.close();

		int i=0;
		char temp;

		for(i=0;i<arr.length/2;i++)
		{
			temp = arr[i];
			arr[i]= arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]);
		}
	}
}
