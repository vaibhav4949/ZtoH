package functions_Methods;

public class Convert_uppercase 
{
	public class Convert_UpperCase 
	{
		public static void main(String[]args) 
		{
			String str = "hi,good morning";
			upper();
			upper1(str);
			
			String str1 = "ztoh India Ites pvt Ltd";
			System.out.println( '\n' + "Return With Argument");
			char ch []= upper2(str1);
	        System.out.println(ch);
		}
		
		public static void upper()
		{		
			System.out.println( "Without Argument");
			
			String str = "hi how are you";
			char[]arr = str.toCharArray();

			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>=97 && arr[i]<=122)
				{
					arr[i] = (char)(arr[i]-32);

					System.out.print(arr[i]);
				}
				else
				{
					System.out.print(arr[i]);
				}
			}
		}
		
		public static void upper1(String str)
		{
			System.out.println( '\n' + "With Argument");	
		
			char[]arr = str.toCharArray();

			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>=97 && arr[i]<=122)
				{
					arr[i] = (char)(arr[i]-32);

					System.out.print(arr[i]);
				}
				else
				{
					System.out.print(arr[i]);
				}
			}
		}
		
		public static char[] upper2(String str1)
		{	
			char[]arr = str1.toCharArray();

			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>=97 && arr[i]<=122)
				{
					arr[i] = (char)(arr[i]-32);
				}
			}
			return arr;
		}
	}
}
