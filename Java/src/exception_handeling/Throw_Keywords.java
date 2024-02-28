package exception_handeling;

public class Throw_Keywords 
{
	// The Java throw keyword is used to throw an exception explicitly.

	public static void main(String[]args) 
	{  
		checkNum(-2);  
		System.out.println("Rest of the code..");  

	}
	
	public static void checkNum(int num) 
	{  
		if (num < 1) 
		{  
			throw new ArithmeticException("\nNumber is negative,cannot calculate square");  
		}  
		else 
		{  
			System.out.println("Square of " + num + " is " + (num*num));  
		}  
	}
}


