package functions_Methods;

public class String_Palindrome 
{
	public static void main(String[]args) 
	{
		String str = "naman";
		palindrome();
		palindrome1(str);

		boolean pal  = palindrome2(str);

		if(pal)
		{
			System.out.println("The Given String is Palindrome");
		}
		else
		{
			System.out.println("The Given String is Not Palindrome");
		}
	}

	public static void palindrome()
	{
		String str = "naman";

		char arr[]  =str.toCharArray();
		int count = 0;

		int x = arr.length-1;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==arr[x])
			{
				count++;
			}
			x--;
		}
		if(count==arr.length)
		{
			System.out.println("The Given String is Palindrome");
		}
		else
		{
			System.out.println("The Given String is Not Palindrome");
		}
	}

	public static void palindrome1(String str)
	{
		char arr[]  =str.toCharArray();
		int x = arr.length-1;
		int count=0;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==arr[x])
			{
				count++;
			}
			x--;
		}
		if(count==arr.length)
		{
			System.out.println("The Given String is Palindrome");
		}
		else
		{
			System.out.println("The Given String is Not Palindrome");
		}
	}

	public static boolean palindrome2(String str)
	{
		char arr[]  =str.toCharArray();
		int count =0;
		int x = arr.length-1;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==arr[x])
			{
				count++;
			}
			x--;
		}
		if(count==arr.length)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
