package functions_Methods;

public class Array_Descening_Order 
{
	public static void main(String[]args) 
	{
		int arr[] = {30,-3,-1,0,40}; 
		descending();
		descending1(arr);
		
		System.out.println('\n'+"Return With Argument");
		int arr2[] = {10,0,-1,20,50};
		int des[] = descending2(arr2);
		for(int i =0;i<arr2.length;i++)
		{   
			System.out.print(des[i] + " ");	
		}		
	}

	public static void descending()
	{	
		System.out.println("Without Argument");

		int temp;
		int arr[] = {10,0,-1,20,50}; 		

		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i =0;i<arr.length;i++)
		{   
			System.out.print(arr[i] + " ");
		}
	}

	public static void descending1(int arr[])
	{	
		System.out.println();
		System.out.println("With Argument");
		int temp;					

		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i =0;i<arr.length;i++)
		{   
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int[] descending2(int arr2[])
	{	
		int temp;					

		for(int i=0;i<arr2.length;i++)
		{
			for(int j=i+1;j<arr2.length;j++)
			{
				if(arr2[i]<arr2[j])
				{
					temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
		}
		return arr2;		
	}
}
