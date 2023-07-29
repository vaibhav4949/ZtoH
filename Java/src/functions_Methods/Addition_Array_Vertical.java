package functions_Methods;

public class Addition_Array_Vertical 
{
	public static void main(String[]args) 
	{
		int arr1[] = {10,20,30,40,50};
		int arr2[] = {20,10,50,40,30};
		int arr3[] = new int[arr1.length];

		function();
		function1(5,5,arr1,arr2,arr3);

		System.out.println();
		System.out.println("Return With Argument");

		int arr4[] = {10,20,30,40,50};
		int arr5[] = {20,10,50,40,30,};
		int arr6[] = new int[arr4.length];
		int add[] = function2(5,5,arr4,arr5,arr6);

		for(int l=0;l<arr4.length;l++)
		{
			System.out.print(add[l] + " ");
		}		
	}

	public static void function()
	{
		System.out.println("Without Argument");

		int s1=5,s2=5;
		int arr1[] = {10,20,30,40,50};
		int arr2[] = {20,10,50,40,30};
		int arr3[] = new int[s1];

		if(s1==s2)
		{				

			for(int k=0;k<arr1.length;k++)
			{
				arr3[k] = arr1[k] + arr2[k];
			}

			for(int l=0;l<s1;l++)
			{
				System.out.print(arr3[l] + " ");
			}
		}
		else
		{
			System.out.println("The Array Size is Not Equal");
		}
	}
	public static void function1(int s1,int s2,int arr1[],int arr2[],int arr3[])
	{
		System.out.println();
		System.out.println("With Argument");

		if(s1==s2)
		{				

			for(int k=0;k<arr1.length;k++)
			{
				arr3[k] = arr1[k] + arr2[k];
			}

			for(int l=0;l<s1;l++)
			{
				System.out.print(arr3[l] + " ");
			}
		}
		else
		{
			System.out.println("The Array Size is Not Equal");
		}
	}

	public static int[] function2(int s1,int s2,int arr4[],int arr5[],int arr6[])
	{


		if(s1==s2)
		{			
			for(int k=0;k<arr4.length;k++)
			{
				arr6[k] = arr4[k] + arr5[k];
			}
		}		
		return arr6;
	}
}
