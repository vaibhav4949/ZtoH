package basic_Logical_Programs;

import java.util.Scanner;

public class Switch_Month 
{
	public static void main(String[]args) 
	{
	 Scanner sc  = new Scanner(System.in);
	 
	 System.out.println("Enter the Number in between 1 to 12 ");
	 int month = sc.nextInt();
	 
	 switch(month)
	 {
	 case 1 : System.out.println("This Month is Jan");break;
	 case 2 : System.out.println("This Month is Feb");break;
	 case 3 : System.out.println("This Month is March");break;
	 case 4 : System.out.println("This Month is April");break;
	 case 5 : System.out.println("This Month is May");break;
	 case 6 : System.out.println("This Month is June");break;
	 case 7 : System.out.println("This Month is Jule");break;
	 case 8 : System.out.println("This Month is Aug");break;
	 case 9 : System.out.println("This Month is Sep");break;
	 case 10: System.out.println("This Month is Oct");break;
	 case 11: System.out.println("This Month is Nov");break;
	 case 12: System.out.println("This Month is Dec"); break;
	 
	 default : System.out.println("Enter Valid Number");
	 }
	 sc.close();
	}
}
