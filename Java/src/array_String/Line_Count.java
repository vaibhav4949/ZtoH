package array_String;

public class Line_Count 
{
	public static void main(String[]args) 
	{
		System.out.println("Enter Your Sentences");
		
		String line = "Hello \n Vaibhav";
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
}
