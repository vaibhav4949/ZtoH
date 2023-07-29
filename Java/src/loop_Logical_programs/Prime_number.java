package loop_Logical_programs;

import java.util.Scanner;

public class Prime_number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Number");
		
		int n = sc.nextInt();
		int count = 0;
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}			
		}		
		    if(count==2)
		    {
		     System.out.println("The number is Prime Number");
		    }
		    
		    else
		    {
		    	System.out.println("The number is not prime");
		    }
		    sc.close();
	}
}
