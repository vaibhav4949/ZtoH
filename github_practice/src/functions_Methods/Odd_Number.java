package functions_Methods;

public class Odd_Number 
{
	public static void main(String[]args) 
	{
		odd();
		odd1(2);
		
		boolean od = odd2(3);
		
		if(od)
		{
			System.out.println("The Given Number is Odd Number");
		}
		else
		{
			System.out.println("It is Not Odd Number");
		}
		
	}

	public static void odd()         // Without Argument
	{
		int n=3;

		if(n%2!=0)
		{
			System.out.println("The Given Number is Odd Number");
		}
		else
		{
			System.out.println("It is Not Odd Number");
		}
	}
	public static void odd1(int n)        // With Argument
	{
		if(n%2!=0)
		{
			System.out.println("The Given Number is Odd Number");
		}
		else
		{
			System.out.println("It is Not odd number");
		}
	}
	
	public static boolean odd2(int n)        // With Argument
	{
		if(n%2!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
