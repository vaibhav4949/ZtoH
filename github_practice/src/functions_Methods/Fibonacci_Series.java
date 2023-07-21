package functions_Methods;

public class Fibonacci_Series 
{
	public class Fibonacci 
	{
		public static void main(String[]args) 
		{
			fib();
			fib1(3);
		}

		public static void fib()
		{
			int n=5,a=0,b=1,c=0;

			for(int i=0;i<=n;i++)
			{
				if(c<=n)
				{
					c=a+b;
					a=b;
					b=c;

					System.out.print(c);
				}
			}
		}

		public static void fib1(int n)
		{
			int a = 0,b=1,c=0;
			System.out.println();

			for(int i=0;i<=n;i++)
			{
				if(c<=n)
				{
					c=a+b;
					a=b;
					b=c;

					System.out.print(c);
				}
			}
		}
	}
}
