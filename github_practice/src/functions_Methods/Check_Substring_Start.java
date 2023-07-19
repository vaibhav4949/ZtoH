package functions_Methods;

public class Check_Substring_Start 
{
	public static void main(String[]args) 
	{
		String s1 = "Hello goog morning";
		String s2 = "He";

		start();
		start1(s1,s2);

		System.out.println("Return With Argument");
		String s3 = "ZtoH India Ites Pvt ltd";
		String s4 = "ZtoH";
		boolean sub  = start2(s3,s4);

		if(sub)
		{
			System.out.println("It is substring");
		}

		else
		{
			System.out.println("It is Not Substring");
		}
	}

	public static void start()
	{
		System.out.println("Without Argument");
		String s1 = "Hi how are you";
		char arr[] = s1.toCharArray();

		String s2 = "Hi";
		char arr1[] = s2.toCharArray();

		int count=0;

		for(int i=0;i<arr1.length;i++)
		{
			if(arr[i]==arr1[i])
			{
				count++;
			}
		}

		if(count==arr1.length)
		{
			System.out.println("It is Substring");
		}
		else
		{
			System.out.println("Not Substring");
		}
	}

	public static void start1(String s1,String s2)
	{
		System.out.println("With Argument");

		int count = 0;
		char arr[] = s1.toCharArray();		
		char arr1[] = s2.toCharArray();

		for(int i=0;i<arr1.length;i++)
		{
			if(arr[i]==arr1[i])
			{
				count++;
			}
		}

		if(count==arr1.length)
		{
			System.out.println("It is Substring");
		}
		else
		{
			System.out.println("Not Substring");
		}
	}

	public static boolean start2(String s3,String s4)
	{	
		int count = 0;
		char arr[] = s3.toCharArray();		
		char arr1[] = s4.toCharArray();

		for(int i=0;i<arr1.length;i++)
		{
			if(arr[i]==arr1[i])
			{
				count++;
			}
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
