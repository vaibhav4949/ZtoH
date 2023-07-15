package basic_Logical_Programs;

import java.util.Scanner;

public class Shop_Discount 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome In Mart");
		
		System.out.println("Enter Your Quantity");
		int qty = sc.nextInt();
		
		System.out.println("Enter Your Cost");		
		int cost= sc.nextInt();
		
		System.out.println("Enter Your Discount");
		int dis = sc.nextInt();  
		
		int total;
		int Final;
		int tc;

		total = qty*cost;

		if(total>1000)
		{
			Final = dis*(total/100);

			System.out.println("The Final Discount is ="+ Final);

			tc = total-Final;
			System.out.println("The total cost is " + tc);
			
			sc.close();
		}
		
		else
		{
			System.out.println("Please Purchase more than Rs = 1000");
		}
	}
}
