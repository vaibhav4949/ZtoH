package basic_Logical_Programs;

public class Company_Bonus1 
{
	public static void main(String[]args) 
	{
		bonus();
		bonus1(8,180000);
	}

	public static void bonus()
	{   
		int year =7,salary=150000;
		int tb;

		if(year>5)
		{
			tb = 5*(salary/100);

			System.out.println("You are eligible for bonus");
			System.out.println("The bonus is = " + tb);
			System.out.println("Total Salary and Bonus =" + (salary+tb));
		}

		else
		{
			System.out.println("Not eligible for bonus");
		}
	}
	public static void bonus1(int year,int salary)
	{   
		int tb;

		if(year>5)
		{
			tb = 5*(salary/100);

			System.out.println("You are eligible for bonus");
			System.out.println("The bonus is = " + tb);
			System.out.println("Total Salary and Bonus =" + (salary+tb));
		}

		else
		{
			System.out.println("Not eligible for bonus");
		}
	}
}
