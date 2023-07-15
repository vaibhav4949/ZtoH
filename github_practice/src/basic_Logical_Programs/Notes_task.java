package basic_Logical_Programs;

import java.util.Scanner;

public class Notes_task 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your amount");

		int n = sc.nextInt();
		if(n>0)
		{
			int a = n/2000;
			int total1 = a*2000;
			System.out.println("2000*"+ a +"=" + total1);

			int b = n/500;
			int total2 = b*500;
			System.out.println("500*"+ b +"=" + total2);

			int c = n/200;
			int total3 = c*200;
			System.out.println("200*"+ c + "=" + total3);

			int d = n/100;
			int total4 = d*100;
			System.out.println("100*"+ d + "=" + total4);

			int e = n/50;
			int total5 = e*50;
			System.out.println("50*"+ e + "=" + total5);

			int f = n/20;
			int total6 = f*20;
			System.out.println("20*"+ f + "=" + total6);

			int g = n/100;
			int total7 = g*100;
			System.out.println("10*"+ g + "=" + total7);

		}
		else
		{
			System.out.println(" Invalid number");
		}	
		sc.close();
	}
}
