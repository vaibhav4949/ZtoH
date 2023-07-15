package loop_Logical_programs;

import java.util.Scanner;

public class Palindrome_Upto_1000 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Number");
		int n = sc.nextInt();
		
		for(int i =1;i<=n;i++)
		{
			int temp =i,rev=0,move,mod;

			while(temp>0)
			{
				mod = temp%10;
				move = rev*10;
				rev = move+mod;
				temp=temp/10;
			}

			if(rev==i)
			{
				System.out.println(i);
			}
		}
		sc.close();
	}
}
