package loop_Logical_programs;

import java.util.Scanner;

public class Reverse_Number2 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		
		int a  = sc.nextInt();
		int temp = a,b;
		
		System.out.print("The Reverse Number Of " + a + " is ");
		
		while(temp!=0) 
		{   
			b=temp%10;                       // 0,0,1
			System.out.print(b);            //  0,0,1
			temp=temp/10;                  //   10,1,0
		}		
         sc.close();                   
	}
}
