package basic_Logical_Programs;

import java.util.Scanner;

public class Grading_System 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Tell Me About Your Marks");
		
		int marks = sc.nextInt();

		if(marks>= 25 && marks<=45)
		{
			System.out.println("Your Grade is E");  
		}

		else if(marks>45 && marks<=50)
		{
			System.out.println("Your Grade is D");
		}

		else if(marks>50 && marks<=60)
		{
			System.out.println("Your Grade is C");
		}

		else if(marks>60 && marks<=80)
		{
			System.out.println("Your Grade is B");
		}

		else if(marks>=80 && marks<=100)
		{
			System.out.println("Your Grade is A");
		}	
		
		sc.close();
	}
}
