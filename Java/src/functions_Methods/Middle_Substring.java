package functions_Methods;

public class Middle_Substring 
{
	public static void main(String[]args) 
	{
		String cv = "Hi hello are you";
		String cs = "hello";

		middle();
		middle1(cv,cs,0);
		
		System.out.println("Return With Argument");
		boolean md = middle2(cv,cs,0);
		
		if(md)
		{
			System.out.println("Yes it is Middle Sub String");
		}
		else
		{
			System.out.println("No its Not Middle Substring");
		}
	}

	public static void middle()
	{
		System.out.println("Without Argument");

		String cv = "Hi how are you";			
		char arr[] = cv.toCharArray();

		String cs = "Hi";
		char arr1[] = cs.toCharArray();

		int count =0;

		for(int i=0;i<arr.length;i++)
		{       	
			count=0;
			if(arr[i]==arr1[0])
			{
				int k=i;
				for(int j=0;j<arr1.length;j++)
				{
					if(arr[k]==arr1[j])
					{
						count++;
						k++;
					}
					else
					{
						break;
					}
				}
				if(count==arr1.length)
				{
					break;
				}
			}
		}
		if(count==arr1.length)
		{
			System.out.println("Yes it is Middle Sub String");
		}
		else
		{
			System.out.println("No its Not Middle Substring");
		}
	}

	public static void middle1(String cv,String cs,int count)
	{
		System.out.println("Without Argument");

		char arr[] = cv.toCharArray();		
		char arr1[] = cs.toCharArray();

		for(int i=0;i<arr.length;i++)
		{       	
			count=0;
			if(arr[i]==arr1[0])
			{
				int k=i;
				for(int j=0;j<arr1.length;j++)
				{
					if(arr[k]==arr1[j])
					{
						count++;
						k++;
					}
					else
					{
						break;
					}
				}
				if(count==arr1.length)
				{
					break;
				}
			}
		}
		if(count==arr1.length)
		{
			System.out.println("Yes it is Middle Sub String");
		}
		else
		{
			System.out.println("No its Not Middle Substring");
		}
	}
	
	public static boolean middle2(String cv,String cs,int count)
	{
		char arr[] = cv.toCharArray();		
		char arr1[] = cs.toCharArray();

		for(int i=0;i<arr.length;i++)
		{       	
			count=0;
			if(arr[i]==arr1[0])
			{
				int k=i;
				for(int j=0;j<arr1.length;j++)
				{
					if(arr[k]==arr1[j])
					{
						count++;
						k++;
					}
					else
					{
						break;
					}
				}
				if(count==arr1.length)
				{
					break;
				}
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
