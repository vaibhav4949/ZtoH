package functions_Methods;

public class Factorial 
{
	public static void main(String[]args) 
	{
		factorial();
		factorial1(4);
		
		int fact = factorail2(5);	
		System.out.println("The Factorial Of Given No is " + fact);
	}

	public static void factorial()
	{
		int n=5,sum = 1;

		for(int i=1;i<=n;i++)
		{
			sum = sum*i;
		}
		System.out.println("The Factorial Of Given No is " + sum);
	}

	public static void factorial1(int n)
	{
		int sum = 1;

		for(int i=1;i<=n;i++)
		{
			sum = sum*i;
		}
		System.out.println("The Factorial Of Given No is " + sum);
	}
	
	public static int factorail2(int n)
	{
		int sum = 1;

		for(int i=1;i<=n;i++)
		{
			sum = sum*i;
		}
		return sum;
	}
}
