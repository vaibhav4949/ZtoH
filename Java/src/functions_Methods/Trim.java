package functions_Methods;

public class Trim 
{
	public static void main(String[]args)     // It will remove starting and last space.
	{
		String s = "     Hello how are you     ";
		trim();
		trim1(s);
	}

	public static void trim()
	{
		System.out.println("Without Argument");
		String s = "     Hi how are you     ";

		char c [] = s.toCharArray();
		String s1 = "";

		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=' ')
			{
				for(int j=i;j<c.length;j++)
				{
					s1 = s1+c[j];
				}
				break;
			}
		}
		char a1[] = s1.toCharArray();
		String temp  = "";

		for(int i=a1.length-1;i>=0;i--)
		{
			if(a1[i]!=' ')
			{
				for(int j=i;j>=0;j--)
				{
					temp = a1[j] + temp;
				}
				break;
			}
		}
		System.out.println(temp);
	}
	
	public static void trim1(String s)
	{		
		System.out.println("With Argument");
		char c [] = s.toCharArray();
		String s1 = "";

		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=' ')
			{
				for(int j=i;j<c.length;j++)
				{
					s1 = s1+c[j];
				}
				break;
			}
		}
		char a1[] = s1.toCharArray();
		String temp  = "";

		for(int i=a1.length-1;i>=0;i--)
		{
			if(a1[i]!=' ')
			{
				for(int j=i;j>=0;j--)
				{
					temp = a1[j] + temp;
				}
				break;
			}
		}
		System.out.println(temp);
	}
}
