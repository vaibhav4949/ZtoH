package functions_Methods;

public class Pattern2 
{
	public static void main(String[]args) 
	{
		pat();
		pat1(5);

	}
	public static void pat()
	{
		System.out.println("With Argument");
		int n = 5;

		for(int r=1;r<=n;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(r);
			}
			System.out.println();
		}
	}

	public static void pat1(int n)
	{
		System.out.println("Without Argument");
		for(int r=1;r<=n;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(r);
			}
			System.out.println();
		}
	}
}
