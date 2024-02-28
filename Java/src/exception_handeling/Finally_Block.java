package exception_handeling;

public class Finally_Block 
{
	public static void main(String[]args) 
	{
		// For each try block there can be zero or more catch blocks, but only one finally block.
		// It can be used in the following cases:

		// **** 1.When an exception does not occur. ****

		try
		{    
			//below code do not throw any exception  
			int data=25/5;    
			System.out.println(data);    
		} 

		//catch not executed 

		catch(NullPointerException e)
		{  
			System.out.println(e);  
		} 

		//Executed whether exception occurred or not

		finally 
		{  
			System.out.println("finally block is always executed");  
		}

		System.out.println("rest of the code...");  

		// ---------------------------------------------------------------------

		// ***2.When an exception occurs but not handled by the catch block.***

		try 
		{    
			System.out.println("Inside the try block");    
			int data=25/0;                        //below code throws divide by zero exception
			System.out.println(data);    
		}  

		// cannot handle Arithmetic type exception  

		catch(NullPointerException e)     //can only accept Null Pointer type exception 
		{  
			System.out.println(e);  
		}   

		// Executes Whether of exception occurred or not.

		finally 
		{  
			System.out.println("finally block is always executed");  
		}    

		System.out.println("rest of the code..."); 

		// ---------------------------------------------------------------------------

		// **** 3.When an exception occurs and is handled by the catch block. ****

		try 
		{    
			System.out.println("Inside try block");    
			int data=25/0;                             // below code throws divide by zero exception
			System.out.println(data);    
		}   

		//handles the Arithmetic Exception   
		catch(ArithmeticException e)
		{  
			System.out.println("Exception handled");  
			System.out.println(e);                   // Show Divide by zero exception
		}   

		//executes regardless of exception occurred or not  

		finally 
		{  
			System.out.println("finally block is always executed");  
		}    

		System.out.println("rest of the code...");    
	}    
}
