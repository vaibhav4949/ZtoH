package functions_Methods;

public class Array_Left_Shift 
{
	public static void main(String[]args) 
	{
		int arr[] = {1,2,3,4,5};
		left();
		left1(arr);

		System.out.println('\n' + "Return With Argument");
		int arr1[] = {1,2,3,4,5};
		int le [] = left2(arr1);

		for(int k=0;k<arr.length;k++)
		{
			System.out.print(le[k] +" ");
		}
	}

	public static void left()
	{
		System.out.println("Without Argument");	

		int arr[] = {10,20,30,40,50};		
		int temp = arr[0];

		for(int j=0;j<arr.length-1;j++)
		{
			arr[j] = arr[j+1];
		}
		arr[arr.length-1] = temp;

		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k] +" ");
		}
	}

	public static void left1(int arr[])
	{
		System.out.println();
		System.out.println("With Argument");

		int temp = arr[0];

		for(int j=0;j<arr.length-1;j++)
		{
			arr[j] = arr[j+1];
		}
		arr[arr.length-1] = temp;

		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k] +" ");
		}
	}

	public static int[] left2(int arr1[])
	{	
		int temp = arr1[0];

		for(int j=0;j<arr1.length-1;j++)
		{
			arr1[j] = arr1[j+1];
		}
		arr1[arr1.length-1] = temp;
		return arr1;			
	}
}
