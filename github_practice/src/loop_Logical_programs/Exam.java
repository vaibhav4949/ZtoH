package loop_Logical_programs;

public class Exam 
{
	public static void main(String[]args)     // armstrong,palindrome,perfect
	{
		for(int i = 1;i<=1000;i++)
		{
			int sum = 0;

			for(int j =1;j<i;j++)
			{
				if(i%j==0)
				{
					sum = sum+j;
				}
			}
			if(sum==i)
			{
				int temp = i,temp2=i,v=0,count=0,rem=0;

				while(temp>0)
				{
					temp = temp/10;
					count++;
				}

				while(temp2>0)
				{
					int b=1;
					rem = temp2%10;

					for(int k=1;k<=count;k++)
					{
						b=b*rem;
					}
					v=v+b;
					temp2=temp2/10;
				}
				if(v==i)
				{
					int temp1 =i,mov=0,rev=0;

					while(temp1>0)
					{
						int rem1 = temp1%10;
						mov=rev*10;
						rev=rem1+mov;
						temp1=temp1/10;
					}
					if(rev==i)
					{
						System.out.println(i + " is Perfect,Palindrome and Armstrong Number");
					}
				}
			}
		}
	}
}
