package functions_Methods;

public class Frequency 
{	
	public static void main(String[]args) 
	{
		String cs = "vaibhav";
		frequency();
		frequency1(cs);
	}

	public static void frequency()
	{
		System.out.println("Without Argument");
		String cs = "Hello";
		char arr[] = cs.toCharArray();

		int count;

		for(int i=0;i<arr.length;i++)
		{		
			count=0;				
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					for(int k=i-1;k>=0;k--)
					{
						if(arr[k]==arr[i])
						{
							count--;
						}
					}
				}
			}
			if(count>0)
			{
				System.out.println(arr[i] + " " + count);
			}
			count=0;		
		}
	}

	public static void frequency1(String cs)
	{
		System.out.println("With Argument");

		char arr[] = cs.toCharArray();
		int count;

		for(int i=0;i<arr.length;i++)
		{		
			count=0;				
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					for(int k=i-1;k>=0;k--)
					{
						if(arr[k]==arr[i])
						{
							count--;
						}
					}
				}
			}
			if(count>0)
			{
				System.out.println(arr[i] + " " + count);
			}
			count=0;		
		}
	}
}


