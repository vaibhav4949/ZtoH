package basic_programs;

import java.util.Scanner;

public class Practice 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String");
		String s = sc.nextLine();
		
		char arr[] = s.toCharArray();
		char temp = arr[0];
		
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];			
		}
		arr[s.length()-1]=temp;
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}		
	}
}

