package loop_Logical_programs;

import java.util.Scanner;

public class Palindrome_Check 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Number");
		
		int n = sc.nextInt();
		
		int rev = 0,mod,move,temp=n;
		
		while(temp>0)
		{
			mod=temp%10;
			move=rev*10;
			rev=move+mod;
			temp=temp/10;
		}
		
		if(rev==n)
		{
			System.out.println("The given number "+ n + " is Palindrome Number");
		}
		
		else
		{
			System.out.println("The Given Number " + n + " is Not Palindrome" );
		}
		sc.close();
	}	
}
