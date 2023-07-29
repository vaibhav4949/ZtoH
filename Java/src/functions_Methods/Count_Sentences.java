package functions_Methods;

public class Count_Sentences 
{
	public static void main(String[]args) 
	{
		String str = "hello how are you.Good Morning.bye.";
		sentences();
		sentences1(str);
				
		System.out.println("Return With Arguments");
		int se = sentences2(str);
		System.out.println("The total Sentences is " + se);
	}
	
	public static void sentences()
	{
		System.out.println("Without Arguments");
		
		String str = "Hi how are you.Good Morning";
		char arr[] = str.toCharArray();
		int count = 1;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='.')
			{
				if(!(i==0||i==arr.length-1))
				{
					count++;
				}

				if(i!=(arr.length-1))
				{
					if(arr[i+1]=='.')
					{
						count--;
					}
				}
			}
		}
		System.out.println("The total Sentences is " + count);
	}
	
	public static void sentences1(String str)
	{
		System.out.println("With Arguments");
		int count =1;
		
		char arr[] = str.toCharArray();

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='.')
			{
				if(!(i==0||i==arr.length-1))
				{
					count++;
				}

				if(i!=(arr.length-1))
				{
					if(arr[i+1]=='.')
					{
						count--;
					}
				}
			}
		}
		System.out.println("The total Sentences is " + count);
	}
	
	public static int sentences2(String str)
	{	
		int count =1;
		char arr[] = str.toCharArray();

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='.')
			{
				if(!(i==0||i==arr.length-1))
				{
					count++;
				}

				if(i!=(arr.length-1))
				{
					if(arr[i+1]=='.')
					{
						count--;
					}
				}
			}
		}
		return count;
	}
}
