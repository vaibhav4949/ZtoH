package functions_Methods;

public class Pattern5 
{
	public static void main(String[]args) 
	{
		pat();
		pat1(5);
	}

	public static void pat()
	{
		System.out.println("Without Argument");
		int n = 5;

		for(int r=1;r<=n;r++)
		{
			for(int s=1;s<=n-r;s++)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++)
			{
				System.out.print("* ");  
			}
			System.out.println();  
		}

		for(int r=1;r<=n;r++)
		{
			for(int s=1;s<=r;s++)
			{  
				System.out.print(" ");
			}
			for(int c=1;c<=n-r;c++)
			{
				System.out.print("* ");
			} 
			System.out.println();
		}
	}

	public static void pat1(int n)
	{
		System.out.println("With Argument");

		for(int r=1;r<=n;r++)
		{
			for(int s=1;s<=n-r;s++)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++)
			{
				System.out.print("* ");  
			}
			System.out.println();  
		}

		for(int r=1;r<=n;r++)
		{
			for(int s=1;s<=r;s++)
			{  
				System.out.print(" ");
			}
			for(int c=1;c<=n-r;c++)
			{
				System.out.print("* ");
			} 
			System.out.println();
		}
	}
}
