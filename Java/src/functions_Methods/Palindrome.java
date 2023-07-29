package functions_Methods;

public class Palindrome 
{
	public static void main(String[]args) 
	{
		palindrome();
		palindrome1(120);
		boolean pal = palindrome2(121);
		if(pal)
		{
			System.out.println("The Given Number is Palindrome Number");
		}
		
		else
		{
			System.out.println("The Given Number iS Not Palindrome");
		}				
	}

	public static void palindrome()               // Without Argument
	{
		int n=151,rev = 0,mod,move,temp=n;

		while(temp>0)
		{
			mod=temp%10;
			move=rev*10;
			rev=move+mod;
			temp=temp/10;
		}

		if(rev==n)
		{
			System.out.println("The Given number "+ n + " is Palindrome Number");
		}

		else
		{
			System.out.println("The Given Number " + n + " is Not Palindrome" );
		}
	}

	public static void palindrome1(int n)           // With Argument
	{
		int rev = 0,mod,move,temp=n;

		while(temp>0)
		{
			mod=temp%10;
			move=rev*10;
			rev=move+mod;
			temp=temp/10;
		}

		if(rev==n)
		{
			System.out.println("The given number "+ n + " is Palindrome Number");
		}

		else
		{
			System.out.println("The Given Number " + n + " is Not Palindrome" );
		}
	}
	
	public static boolean palindrome2(int n)           // With Argument
	{
		int rev = 0,mod,move,temp=n;

		while(temp>0)
		{
			mod=temp%10;
			move=rev*10;
			rev=move+mod;
			temp=temp/10;
		}

		if(rev==n)
		{
			return true;
		}

		else
		{
			return false;
		}
	}
}
