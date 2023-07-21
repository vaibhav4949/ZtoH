package functions_Methods;

public class Even_Number 
{
	public class Even_No 
	{
		public static void main(String[]args) 
		{
			even();
			even1(3);
			boolean ev= even2(8);
			if(ev)
			{
				System.out.println("The No is Even No");
			}
			else
			{
				System.out.println("The No is Not Even No");
			}
		}

		public static void even()          // Without Argument
		{
			int n=4;

			if(n%2==0)
			{
				System.out.println("The Given Number is Even Number");				
			}
			else
			{
				System.out.println("The Given Number is Not Even Number");
			}
		}

		public static void even1(int n)       // With Argument
		{
			if(n%2==0)
			{
				System.out.println("The Given Number is Even Number");				
			}
			else
			{
				System.out.println("The Given Number is Not Even Number");
			}
		}

		public static boolean even2(int n)
		{

			if(n%2==0)
			{
				return true;				
			}
			else
			{
				return false;
			}		
		}
	}
}
