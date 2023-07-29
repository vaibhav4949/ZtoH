package functions_Methods;

public class String_Remove_Duplicate 
{
	public static void main(String[]args) 
	{  
		String str = "Hiii how are you";
		duplicate();
		duplicate1(str);

//		System.out.println("Return With Argument");
//		String str1="hii vaibhav";
//		char dupli[] = duplicate2(str1);
//		display(dupli);
	}

	public static void duplicate()
	{
		System.out.println("Without Argument");

		String str = "Hiii how are you";
		char arr[] = str.toCharArray();
		int count =0;

		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					for(int k=i-1;k>=0;k--)
					{
						if(arr[k]==arr[i])
						{
							count--;
						}
					}
				}
			}
			if(count>0)
			{
				System.out.print(arr[i] + " ");
			}
			count=0;
		}
	}

	public static void duplicate1(String str)
	{
		System.out.println('\n' + "With Argument");

		char arr[] = str.toCharArray();
		int count =0;

		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					for(int k=i-1;k>=0;k--)
					{
						if(arr[k]==arr[i])
						{
							count--;
						}
					}
				}
			}
			if(count>0)
			{
				System.out.print(arr[i] + " ");
			}
			count=0;
		}
	}

//	public static char[] duplicate2(String str1)
//	{
//		System.out.println('\n' + "With Argument");
//
//		char arr[] = str1.toCharArray();
//		int count =0;
//		char arr2[]=new char[arr.length];
//		int size=0;
//
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i;j<arr.length;j++)
//			{
//				if(arr[i]==arr[j])
//				{
//					count++;
//					for(int k=i-1;k>=0;k--)
//					{
//						if(arr[k]==arr[i])
//						{
//							count--;
//						}
//					}
//				}
//			}
//			if(count>0)
//			{
//				arr2[size]=arr[i];
//				size++;
//			}
//			count=0;
//			
//		}
//		return arr2;
//	}
//	public static void display (char[]arr) 
//	{
//		for(int i=0;i<arr.length;i++) 
//		{
//			if(arr[i]!=0) 
//			{
//				System.out.print(arr[i]);
//			}
//		}
//	}
}
