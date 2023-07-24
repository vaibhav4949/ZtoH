package functions_Methods;

public class Insert_Word 
{
	public static void main(String[]args) 
	{
		String cs = "Hi how are you";
		String cv = "Hi";
		String cx = "Hello";

		word();
		word1(cs,cv,cx,0);
		
		System.out.println( '\n' + "Return With Argument");
		char[] wo =word2(cs,cv,cx,0);
		
		
		for(int i=0;i<cs.length();i++)
		{
			System.out.print(wo[i]);
		}
	}

	public static void word()
	{
		System.out.println("Without Argument");

		String cs = "Hi how are you";
		char[] arr1 = cs.toCharArray();

		String cv = "Hi";
		char[] arr2 = cv.toCharArray();

		String cx = "Hello";
		char[] arr3= cx.toCharArray();

		int count =0;
		int index =0;

		for(int i=0;i<arr1.length;i++)
		{    
			count=0;
			for(int j=0;j<arr2.length;j++)
			{
				if(arr2[j]==arr1[i+j])
				{
					index=i;
					count++;
				}
				else
				{
					break;
				}
			}

			if(count==arr2.length)
			{
				break;
			}
		}

		if(count==arr2.length) {
			for(int i=0;i<=arr3.length;i++)
			{
				for(int j=arr1.length-1;j>index+count;j--)
				{
					arr1[j]=arr1[j-1];
				}
			}

			index=index+count+1;
			for(int j=0;j<arr3.length;j++)
			{
				arr1[index]=arr3[j];
				index++;
			}	
		}

		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]);
		}
	}

	public static void word1(String cs,String cv,String cx,int count)
	{
		System.out.println('\n' + "With Argument");
		int index =0;
		
		char[] arr1 = cs.toCharArray();	
		char[] arr2 = cv.toCharArray();	
		char[] arr3 = cx.toCharArray();

		for(int i=0;i<arr1.length;i++)
		{    
			count=0;
			for(int j=0;j<arr2.length;j++)
			{
				if(arr2[j]==arr1[i+j])
				{
					index=i;
					count++;
				}
				else
				{
					break;
				}
			}			
			if(count==arr2.length)
			{
				break;
			}
		}

		if(count==arr2.length) {
			for(int i=0;i<=arr3.length;i++)
			{
				for(int j=arr1.length-1;j>index+count;j--)
				{
					arr1[j]=arr1[j-1];
				}
			}

			index=index+count+1;
			for(int j=0;j<arr3.length;j++)
			{
				arr1[index]=arr3[j];
				index++;
			}	
		}

		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]);
		}
	}
	
	public static char[] word2(String cs,String cv,String cx,int count)
	{		
		int index =0;
		
		char[] arr1 = cs.toCharArray();	
		char[] arr2 = cv.toCharArray();	
		char[] arr3 = cx.toCharArray();

		for(int i=0;i<arr1.length;i++)
		{    
			count=0;
			for(int j=0;j<arr2.length;j++)
			{
				if(arr2[j]==arr1[i+j])
				{
					index=i;
					count++;
				}
				else
				{
					break;
				}
			}			
			if(count==arr2.length)
			{
				break;
			}
		}

		if(count==arr2.length) {
			for(int i=0;i<=arr3.length;i++)
			{
				for(int j=arr1.length-1;j>index+count;j--)
				{
					arr1[j]=arr1[j-1];
				}
			}

			index=index+count+1;
			for(int j=0;j<arr3.length;j++)
			{
				arr1[index]=arr3[j];
				index++;
			}	
		}
		return arr1;	
	}
}
