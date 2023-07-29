package functions_Methods;

public class Occurence 
{
	public static void main(String[]args) 
	{
		String str = "hi how are you";
		occurence();
		occuence1(str,'h');
		
		int oc = occurence2(str,'h');
		System.out.println(oc);
	}
	
	public static void occurence()
	{
		System.out.println("Without Argument");
		String str = "hi how are you";
		
		char arr []= str.toCharArray();
		char cha  ='h';
		int count =0;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==cha)
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void occuence1(String str,char cha)
	{	
		System.out.println("With Argument");
		
		int count =0;
		char arr []= str.toCharArray();

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==cha)
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static int occurence2(String str,char cha)
	{	
		System.out.println("Return With Argument");	
		
		int count =0;
		char arr []= str.toCharArray();

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==cha)
			{
				count++;
			}
		}
		return count;		
	}
}
