package loop_Logical_programs;

import java.util.Scanner;

public class Armstrong_Number_upto_1000 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Number");
		int n = sc.nextInt();

		for(int i=1;i<=n;i++)
		{
			int sum=0,temp=i,temp1=i,prod=0,rem=0;

			while(temp>0)
			{
				temp = temp/10;
				sum++;
			}

			while(temp1>0)
			{
				rem=temp1%10;
				int b=1;

				for(int k=1;k<=sum;k++)
				{
					b=b*rem;
				}
				prod=prod+b;

				temp1=temp1/10;
			}
			if(prod==i)
			{
				System.out.println(i);
			}
		}
		sc.close();
	}
}
