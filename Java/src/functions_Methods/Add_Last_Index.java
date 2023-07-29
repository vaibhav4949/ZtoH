package functions_Methods;

public class Add_Last_Index 
{
	public static void main(String[]args) 
	{		
		last();                                // Without Argument No return

		int arr[] = {10,20,30,40,50};
		last1(arr,70);                       // With Argument No return

		int arr1[] = {10,20,30,40,50};      // With Argument With return 
		int [] lt = last2(arr1,70);

		System.out.println("Return With Argument");

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(lt[i]);
		}
		System.out.println("");
		
		int arr2[] = {100,200,300,400,500};
		Add_Last_Index lm = new Add_Last_Index ();
		lm.last3(arr2, 700);
	}

	public static void last()
	{
		System.out.println("Without Argument");

		int arr[] = {10,20,30,40,50};
		int ele = 70;

		for(int i =0;i<arr.length-1;i++)
		{
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = ele;

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void last1(int arr[],int ele)
	{
		System.out.println("With Argument");	

		for(int i =0;i<arr.length-1;i++)
		{
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = ele;

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static int[] last2(int arr[],int ele)
	{

		for(int i =0;i<arr.length-1;i++)
		{
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = ele;

		return arr;
	}

	public int[] last3(int arr2[],int ele)
	{

		for(int i =0;i<arr2.length-1;i++)
		{
			arr2[i] = arr2[i+1];
		}
		arr2[arr2.length-1] = ele;
		
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
		return arr2;
	}
}
