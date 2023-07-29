package functions_Methods;

public class Perfect_Number 
{
	public static void main(String[]args) 
	{
		perfect();
		perfect1(7);
		boolean per = perfect2(3);
        
		if(per)
		{
			System.out.println("It is Perfect Number");
		}
		
		else
		{
			System.out.println("It is not Perfect Number");
		}
	}
	public static void perfect()     // Without Argument
	{
		int n=6;
		int count = 0;

		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				count = count+i;
			}
		}
		if(count==n)
		{
			System.out.println("The Given Number is Perfect Number");
		}

		else
		{
			System.out.println("The Given Number is Not Perfect Number");
		}
	}

	public static void perfect1(int n)  // With Argument
	{	
		int count = 0;

		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				count = count+i;
			}
		}
		if(count==n)
		{
			System.out.println("The Number is Perfect Number");
		}

		else
		{
			System.out.println("The Number is Not Perfect Number");
		}
	}
	
	public static boolean perfect2(int n)  // With Argument
	{	
		int count = 0;

		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				count = count+i;
			}
		}
		if(count==n)
		{
			return true;
		}

		else
		{
			return false;
		}
	}
}
