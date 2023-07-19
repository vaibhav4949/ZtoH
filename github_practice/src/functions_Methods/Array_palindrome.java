package functions_Methods;

public class Array_palindrome 
{
	public static void main(String[]args) 
	{
		int arr[] = {1,2,1,4};
		palindrome();
		palindrome1(arr,0);

		System.out.println("Return With Argument");
		int arr2[] = {1,2,3,2,0};
		boolean pal = palindrome2(arr2,0);

		if(pal)
		{
			System.out.println("The Given array is Palindrome");
		}

		else					
		{
			System.out.println("The Given Array is Not Palindrome");
		}
	}

	public static void palindrome()
	{
		System.out.println("Without Argument");
		int arr[] = {1,2,3,2,1};
		int k=arr.length-1;
		int count =0;

		for(int j=0;j<arr.length;j++)
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

	public static void palindrome1(int arr[],int count)
	{	
		System.out.println("With Argument");

		int k=arr.length-1;	

		for(int j=0;j<arr.length;j++)
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

	public static boolean palindrome2(int arr1[],int count)
	{	
		int k=arr1.length-1;	

		for(int j=0;j<arr1.length;j++)
		{
			if(arr1[j]==arr1[k])
			{
				count++;
			}
			k--;
		}
		if(count==arr1.length)
		{			
			 return true;	
		}
		else
		{			
			return false;
		}
	}
}
