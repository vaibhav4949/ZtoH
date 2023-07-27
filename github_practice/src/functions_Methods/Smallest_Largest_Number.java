package functions_Methods;

public class Smallest_Largest_Number 
{
	public static void main(String[]args) 
	{
		int arr[] = {10,0,-1,50,20};
		small();
		small1(arr);
	}

	public static void small()
	{
		System.out.println("Without Argument");
		int arr[] = {90,0,10,50,20};

		int small = arr[0];
		int large = arr[0];

		for(int i=0;i<arr.length;i++)
		{
			if(small>arr[i])
			{
				small = arr[i];
			}
			else if(large<arr[i])
			{
				large = arr[i];
			}			
		}
		System.out.println("The Smallest Number OF Given Array is " + small);
		System.out.println("The Largest Number OF Given Array is " + large);
	}

	public static void small1(int arr[])
	{
		System.out.println("With Argument");

		int small = arr[0];
		int large = arr[0];

		for(int i=0;i<arr.length;i++)
		{
			if(small>arr[i])
			{
				small = arr[i];
			}
			else if(large<arr[i])
			{
				large = arr[i];
			}			
		}
		System.out.println("The Smallest Number OF Given Array is " + small);
		System.out.println("The Largest Number OF Given Array is " + large);
	}
}
