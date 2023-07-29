package functions_Methods;

public class Count_Spaces 
{
	public static void main(String[]args) 
	{
		String cha = "Hi how are you, Good morning";
		spaces();
		spaces1(cha);
		
		System.out.println("Return With Argument");
		int sp = spaces2(cha);
		System.out.println("The Spaces Of given Sentences is " + sp);
	}

	public static void spaces()
	{
		System.out.println("Without Argument");

		String cha = "Hi how are you";
		char arr[] = cha.toCharArray();
		int count =0;

		for(int i=0;i<cha.length();i++)
		{
			if(arr[i]==' ')
			{
				count++;
			}
		}
		System.out.println("The Spaces Of given Sentences is " + count);
	}

	public static void spaces1(String cha)
	{
		System.out.println("With Argument");
		int count =0;
		
		char arr[] = cha.toCharArray();

		for(int i=0;i<cha.length();i++)
		{
			if(arr[i]==' ')
			{
				count++;
			}
		}
		System.out.println("The Spaces Of given Sentences is " + count);
	}
	
	public static int spaces2(String cha)
	{		
		int count =0;
		
		char arr[] = cha.toCharArray();

		for(int i=0;i<cha.length();i++)
		{
			if(arr[i]==' ')
			{
				count++;
			}
		}
	      return count;
	}
}
