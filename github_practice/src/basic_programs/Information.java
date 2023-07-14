package basic_programs;

import java.util.Scanner;

public class Information 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value");
		
		String name = sc.nextLine();
		int rollno = sc.nextInt();
		String interest = sc.next();

		System.out.println("Hey My name is "+ name + "\n" + "My roll  no is " + rollno + "\n" + "My area of interset is " + interest);
		
		sc.close();
	}
}
