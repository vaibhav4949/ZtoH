package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_palindrome 
{
	public static void main(String[]args) 
	{
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter the Size of array");
//		int size = sc.nextInt();
//		int arr [] = new int[size];
//
//		System.out.println("Enter the elements");
//		int k=arr.length-1;
//		int count =0;
//
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=sc.nextInt();
//		}
        int arr[] = {10,20,30,20,10};
        int count =0;
        int k=arr.length-1;
        
		List<Integer> al = new ArrayList<>();

		for(int i=0;i<al.size();i++)
		{
			al.add(arr[i]);
		}
   //      System.out.println("The Size of ArrayList = "+al.size());
	
		for(int j=0;j<al.size();j++)
		{

			if(arr[j]==arr[k])
			{
				count++;
			}
			k--;
		}
		if(count==arr.length)
		{
			System.out.println("The Given array is Palindrome");
		}
		else
		{
			System.out.println("The Given Array is Not Palindrome");
		}
	}
}
