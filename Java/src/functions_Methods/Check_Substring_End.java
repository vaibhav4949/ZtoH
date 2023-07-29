package functions_Methods;

public class Check_Substring_End 
{
	public static void main(String[]args) 
	{
		String s1 = "Hi Good Morning";
		String s2 = "ning";

		end();
		end1(s1,s2);

		String s3 = "ZtoH India Ites Pvt ltd";
		String s4 = "ltd";
		boolean sub  = end2(s3,s4);

		if(sub)
		{
			System.out.println("Yes,It is Substring");
		}

		else
		{
			System.out.println("Yes,It is not Substring");
		}
	}

	public static void end()
	{
		String s1 = "Hi how are you";
		char arr[] = s1.toCharArray();

		String s2 = "you";
		char arr1[] = s2.toCharArray();

		int count=0;
		int size = arr.length-1;

		for(int i=arr1.length-1;i>=0;i--)
		{			
			if(arr[size]==arr1[i])
			{
				count++;
				size--;
			}			
		}

		if(count==arr1.length)
		{
			System.out.println("Yes,It is Substring");
		}
		else
		{
			System.out.println("Its Not Substring");
		}
	}

	public static void end1(String s1,String s2)
	{		
		int count =0;
		char arr[] = s1.toCharArray();		
		char arr1[] = s2.toCharArray();

		int size = arr.length-1;

		for(int i=arr1.length-1;i>=0;i--)
		{			
			if(arr[size]==arr1[i])
			{
				count++;
				size--;
			}			
		}

		if(count==arr1.length)
		{
			System.out.println("Yes,It is Substring");
		}
		else
		{
			System.out.println("Its Not Substring");
		}
	}

	public static boolean end2(String s3,String s4)
	{		
		int count =0;
		char arr[] = s3.toCharArray();		
		char arr1[] = s4.toCharArray();

		int size = arr.length-1;

		for(int i=arr1.length-1;i>=0;i--)
		{			
			if(arr[size]==arr1[i])
			{
				count++;
				size--;
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
