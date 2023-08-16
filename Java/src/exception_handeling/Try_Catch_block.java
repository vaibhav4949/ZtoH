package exception_handeling;

public class Try_Catch_block 
{
	public static void main(String[]args) 
	{
		int a=100,b=0,c;
		
		System.out.println("1");
		try
		{
			System.out.println("2");			
			c=a/b;
			System.out.println(c);
			System.out.println("3");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("4");
			System.out.println(e);
			System.out.println("5");
		}
		System.out.println("Program Executed Successfully");
	}
}
