package array_String;

import java.util.Scanner;

public class Insert_Word 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The String");
		String cs = sc.nextLine();
		char[] arr1 = cs.toCharArray();

		System.out.println("where you want to insert");
		String cv = sc.nextLine();
		char[] arr2 = cv.toCharArray();

		System.out.println("Enter Which Word You Want to Insert");
		String cx = sc.nextLine();
		char[] arr3= cx.toCharArray();

		int count =0;
		int index =0;

		for(int i=0;i<arr1.length;i++)
		{    

			count=0;
			for(int j=0;j<arr2.length;j++)
			{
				if(arr2[j]==arr1[i+j])
				{
					index=i;
					count++;
				}
				else
				{
					break;
				}
			}
			
			if(count==arr2.length)
			{
				break;
			}
		}
		
		if(count==arr2.length) {
			for(int i=0;i<=arr3.length;i++)
			{
				for(int j=arr1.length-1;j>index+count;j--)
				{
					arr1[j]=arr1[j-1];
				}
			}

			index=index+count+1;
			for(int j=0;j<arr3.length;j++)
			{
				arr1[index]=arr3[j];
				index++;
			}	
		}	
		System.out.println("After inserting a word");
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]);
		}
		sc.close();
	}
}
