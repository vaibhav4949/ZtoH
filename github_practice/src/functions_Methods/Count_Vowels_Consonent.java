package functions_Methods;

public class Count_Vowels_Consonent 
{
	public static void main(String[]args) 
	{
		vc();                    
	}

	public static void vc()
	{
		System.out.println("Enter Only A to Z Character");

		String str = "A,e,i,s,O";

		char arr[] = str.toCharArray();
		int count=0;int count1=0;

		for(int i=0;i<str.length();i++)
		{
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U')
			{
				count++;
			}
			else if(arr[i]==' ' || arr[i]== ',' || arr[i]=='.')
			{
				System.out.print("");
			}
			else
			{
				count1++;
			}
		}
		System.out.println("The Total Vowels are in Sentence is " + count);
		System.out.println("The Total Consonants are in Sentence is " + count1);
	}
}
