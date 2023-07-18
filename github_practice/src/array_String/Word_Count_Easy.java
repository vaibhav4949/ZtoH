package array_String;

public class Word_Count_Easy 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Words");
		String str = sc.nextLine();

		char arr[] = str.toCharArray();
		int count = 1;

		for(int i=0;i<arr.length-1;i++)
		{
			//			if(arr[i]==' ' && arr[i+1]!=' ')
			//			{
			//				count++;
			//			}
			if((arr[i]==0 && str.charAt(i+1)!=' ')||(str.charAt(i)==' '&& str.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println("The total Words in given String is " + count);
		sc.close();
	}
}
