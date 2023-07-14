package basic_programs;

import java.util.Scanner;

public class Area_Of_Circle 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Values");
		
		int r = sc.nextInt();
		float s = sc.nextFloat();
		float area;
		
		area = s *(r*r);
		
		System.out.println("The Area Of circle is = " +area);
		sc.close();
	}
}
