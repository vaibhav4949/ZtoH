package array_String;

import java.util.Scanner;

public class Occurance 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);       // Occurrence mean how many characters are repeated in string

		System.out.println("Enter The Sentences");	
		String str = sc.nextLine();
		char arr []= str.toCharArray();

		System.out.println("Enter Which Character You want");
		char cha  =sc.next().charAt(0);

		int count =0;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==cha)
			{
				count++;
			}
		}
		System.out.println("The Reapeated Character OF Given Sentences is " + count);
		sc.close();
	}
}
