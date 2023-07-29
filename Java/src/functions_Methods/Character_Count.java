package functions_Methods;

public class Character_Count 
{
	public static void main(String[]args) 
	{
		String cha = "Hello vaibhav";
		character();
		character1(cha,0);
		
		System.out.println("Return With Argument");
		String str3="ztoh india";
		int count=character2(str3);
		System.out.println("The Character Of given Sentences is " +count);
	}

	public static void character()
	{
		System.out.println("Without Argument");

		String cha = "Hi vaibhav";
		char arr[] = cha.toCharArray();
		int count =0;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=' ')
			{
				count++;
			}
		}
		System.out.println("The Character Of given Sentences is " + count);
	}

	public static void character1(String cha,int count)
	{
		System.out.println("With Argument");

		char arr[] = cha.toCharArray();		

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=' ')
			{
				count++;
			}
		}
		System.out.println("The Character Of given Sentences is " + count);
	}

	public static int character2(String str)
	{	
		int count=0;
		char arr[] = str.toCharArray();		

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=' ')
			{
				count++;
			}
		}
		return count;
	}
}
