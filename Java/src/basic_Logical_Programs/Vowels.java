package basic_Logical_Programs;

import java.util.Scanner;

public class Vowels 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter Your Letter");
		String vo = sc.nextLine();
		
		if(vo.equals("a")||vo.equals("e") ||vo.equals("i")||vo.equals("o")||vo.equals("u"))
		{
			System.out.println("The Letter you have Enter is Vowel");
		}

		else if(vo.equals("A")||vo.equals("E") ||vo.equals("I")||vo.equals("O")||vo.equals("U"))		
		{
			System.out.println("This Letter is Vowels");
		}			
		
		else
		{
			System.out.println("The Letter is consonent");	
		}
		sc.close();
	}
}
