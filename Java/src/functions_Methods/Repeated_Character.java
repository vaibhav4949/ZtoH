package functions_Methods;

public class Repeated_Character 
{
	public static void main(String[]args) 
	{
		character();

	}
	
	public static void character()
	{
		String s = "Hii how arrr yoouuu";
		char arr [] = s.toCharArray();

		int n = arr.length;
		char h=' ';
		int count1=0;

		for(int i =0;i<arr.length;i++)
		{   
			int count=0;
			for(int j=0;j<i;j++)
			{
				if(arr[i]==arr[j] && arr[i]!=' ')
				{
					count++;
				}
			}
			if(count>0)
			{
				if(count<n)
				{
					n=count;
				}
			}
			if(count>count1)
			{
				h=arr[i];
				count1=count;
			}
		}
		System.out.println("Maximum Character " + h);
		System.out.println("Repeated Count = " + n);
	}
}
