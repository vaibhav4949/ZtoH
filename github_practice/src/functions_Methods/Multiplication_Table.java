package functions_Methods;

public class Multiplication_Table 
{
	public static void main(String[]args) 
	{
		mul();
		mul1(2);
		
		int nu =7;
		System.out.println("Return With Argument" + '\n' + "The Multiplication table Of " + nu + " is ");
		int tb= mul2(nu);
		
		for(int i=1;i<=10;i++)
		{		
			System.out.println(nu + " * " + i + " = " + tb);
		} 
	}

	public static void mul()
	{
		int n=5, table;
		System.out.println("Without Argument" + '\n' + "The Multiplication table Of " + n + " is ");

		for(int i=1;i<=10;i++)
		{
			table =n*i;
			System.out.println(n + " * " + i + " = " + table);
		} 		
	}
	
	public static void mul1(int n)
	{
		int table;
		System.out.println("With Argument" + '\n' + "The Multiplication table Of " + n + " is ");

		for(int i=1;i<=10;i++)
		{
			table =n*i;
			System.out.println(n + " * " + i + " = " + table);
		} 
	}
	
	public static int mul2(int nu)
	{
		int table = 0;
		
		for(int i=1;i<=10;i++)
		{
			table =nu*i;			
		} 
		return table;
	}	
}
