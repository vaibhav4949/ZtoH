package exception_handeling;

public class Throws_Keyword 
{
	// The Java throws keyword is used to declare an exception. 

	public static int divideNum(int m, int n) throws ArithmeticException 
	{  
		int div = m / n;  
		return div;  
	}  

	//main method 

	public static void main(String[]args) 
	{  	 
		try 
		{  
			System.out.println(Throws_Keyword.divideNum(45, 0));  
		}  
		catch (ArithmeticException e)
		{  
			System.out.println("\nNumber cannot be divided by 0");  
		}  

		System.out.println("Rest of the code..");  
	}  
}
