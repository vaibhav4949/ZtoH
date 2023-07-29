package functions_Methods;

public class Reverse_String 
{
	public static void main(String[]args) 
	{
		String str = "xyz";
		reverse();
		reverse1(str,0);
		
		System.out.println('\n' + "Return With Argument");
		String str1 = "ABC";
		char re [] = reverse2(str1,0);
		for(int k=0;k<str1.length();k++)
		{
			System.out.print(re[k]);
		}
	}

	public static void reverse()
	{
		System.out.println("Without Argument");
		
		String str = "abcd";
		char arr[] = str.toCharArray();

		int i=0;
		char temp;

		for(i=0;i<arr.length/2;i++)
		{
			temp = arr[i];
			arr[i]= arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]);
		}
	}

	public static void reverse1(String str,int i)
	{
		System.out.println('\n' + "With Argument");
		
		char arr[] = str.toCharArray();
		char temp;

		for(i=0;i<arr.length/2;i++)
		{
			temp = arr[i];
			arr[i]= arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]);
		}
	}
	
	public static char[] reverse2(String str,int i)
	{				
		char arr1[] = str.toCharArray();
		char temp;

		for(i=0;i<arr1.length/2;i++)
		{
			temp = arr1[i];
			arr1[i]= arr1[arr1.length-1-i];
			arr1[arr1.length-1-i] = temp;
		}
		return arr1;		
	}
}
