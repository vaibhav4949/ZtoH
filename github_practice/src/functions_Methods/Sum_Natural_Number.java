package functions_Methods;

public class Sum_Natural_Number 
{
	public static void main(String[]args) 
	{
		natural();
		natural1(10);
		int nat = natural2(7);
		
		System.out.println("The Sum oF Given Natural Number is " + nat);
	}

	public static void natural()
	{
		int n=5,sum=0;

		for(int i=1;i<=n;i++)
		{
			sum = sum+i;  
		}

		System.out.println("The Sum Of Given Natural Number " + n +  " is " + sum);		  		  
	}
	public static void natural1(int n)
	{
		int sum=0;

		for(int i=1;i<=n;i++)
		{
			sum = sum+i;  
		}

		System.out.println("The Sum Of Given Natural Number " + n + " is " + sum);		  
	}

	public static int natural2(int n)
	{
		int sum=0;

		for(int i=1;i<=n;i++)
		{
			sum = sum+i;  
		}
		return sum;				  
	} 
}
