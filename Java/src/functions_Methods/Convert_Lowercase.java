package functions_Methods;

public class Convert_Lowercase 
{
	public static void main(String[]args) 
	{
		String str = "GOOD MORNING";
		lower();
		lower1(str);
		
		System.out.println("Return With Argument");
		String str1 = "AbCDe";
		char [] sr = lower2(str1);
		System.out.print(sr);
	}
	
	public static void lower()
	{
		System.out.println("Withot Argument");
		
		String str = "Hi HOw ARE YOU";
		char[]arr = str.toCharArray();

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=65 && arr[i]<=90)
			{
				arr[i] = (char)(arr[i]+32);

				System.out.print(arr[i]);
			}
			else
			{
				System.out.print(arr[i]);
			}
		}
	}
	
	public static void lower1(String str)
	{	
		System.out.println('\n'+"With Argument");
		char[]arr = str.toCharArray();

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=65 && arr[i]<=90)
			{
				arr[i] = (char)(arr[i]+32);

				System.out.print(arr[i]);
			}
			else
			{
				System.out.print(arr[i]);
			}
		}
	}
	
	public static char[] lower2(String str1)
	{	
		char[]arr1 = str1.toCharArray();

		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]>=65 && arr1[i]<=90)
			{
				arr1[i] = (char)(arr1[i]+32);

			}			
		}
		return arr1;
	}
}
