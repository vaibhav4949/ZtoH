package functions_Methods;

public class Count_Word 
{
	public static void main(String[]args) 
	{
		String str1 = "Hello how are you Vaibhav";
		word();
		word1(str1);
		
		System.out.println("Return with Argument");
		String str2 = "ZtoH India Ites Pvt Ltd";
        int wo = word2(str2);     
        System.out.println("The total Words is " + wo);
	}

	public static void word()
	{
		System.out.println("Without Argument");

		String str = "Hi how are you";
		char arr[] = str.toCharArray();
		int count = 1;

		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==' ')
			{
				if(!(i==0||i==arr.length-1))
				{
					count++;
				}

				if(i!=(arr.length-1))
				{
					if(arr[i+1]==' ')
					{
						count--;
					}
				}
			}
		}
		System.out.println("The total Words is " + count);
	}

	public static void word1(String str1)
	{
		int count =1;
		System.out.println("With Argument");

		char arr[] = str1.toCharArray();

		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==' ')
			{
				if(!(i==0||i==arr.length-1))
				{
					count++;
				}

				if(i!=(arr.length-1))
				{
					if(arr[i+1]==' ')
					{
						count--;
					}
				}
			}
		}
		System.out.println("The total Words is " + count);
	}
	
	public static int word2(String str2)
	{
		int count =1;		
		char arr[] = str2.toCharArray();

		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==' ')
			{
				if(!(i==0||i==arr.length-1))
				{
					count++;
				}

				if(i!=(arr.length-1))
				{
					if(arr[i+1]==' ')
					{
						count--;
					}
				}
			}
		}
		return count;
	}
}
