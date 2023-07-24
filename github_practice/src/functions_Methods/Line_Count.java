package functions_Methods;

public class Line_Count 
{
	public static void main(String[]args) 
	{
		String line = "Hello \n Vaibhav \n how are you";
		line();
		line1(line);
		
		System.out.println("Return With Argument");
		int le = line2(line);		
		System.out.println("The Line Of Given Sentences is " + le);
	}
	
	public static void line()
	{
		System.out.println("Withot Argument");
		
		String line = "Hello \n Vaibhav \n how are you";
		char arr[] = line.toCharArray();
		int count=0;

		for(int i=0;i<line.length();i++)
		{
			if(arr[i]=='\n')
			{
				count++;  
			}
		}
		System.out.println("The Line Of Given Sentences is " + count);
	}
	
	public static void line1(String line)
	{
		System.out.println("With Argument");
		
		int count =0;		
		char arr[] = line.toCharArray();
	
		for(int i=0;i<line.length();i++)
		{
			if(arr[i]=='\n')
			{
				count++;  
			}
		}
		System.out.println("The Line Of Given Sentences is " + count);
	}
	
	public static int line2(String line)
	{
		int count = 0;		
		char arr[] = line.toCharArray();
	
		for(int i=0;i<line.length();i++)
		{
			if(arr[i]=='\n')
			{
				count++;  
			}
		}
		return count;
	}
}
