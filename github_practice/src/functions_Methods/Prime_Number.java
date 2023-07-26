package functions_Methods;

public class Prime_Number 
{
	public static void main(String[]args) 
	{
		prime();
		prime1(4);
		boolean pr = prime2(7);
		
		if(pr)
		{
			System.out.println("It is Prime Number");
		}
		
		else
		{
			System.out.println("It is Not Prime Number");
		}
	}

	public static void prime()
	{
		int n=2, count = 0;

		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}			
		}		
		if(count==2)
		{
			System.out.println("The number is Prime Number");
		}

		else
		{
			System.out.println("The number is not prime");
		}
	}
	public static void prime1(int n)
	{
		int count = 0;

		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}			
		}		
		if(count==2)
		{
			System.out.println("The number is Prime Number");
		}

		else
		{
			System.out.println("The number is not Prime");
		}
	}
	
	public static boolean prime2(int n)
	{
		int count = 0;

		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}			
		}		
		if(count==2)
		{
			return true;
		}

		else
		{
			return false;
		}
	}	
}
