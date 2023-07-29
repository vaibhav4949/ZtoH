package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap_Intenger 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);

		Map<Integer,Integer> map = new HashMap<>();

		int is_execute = 1;

		while(is_execute == 1)
		{
			int x;
			int temp;
			System.out.println("Enter The Key");			
			x = sc.nextInt();

			if(map.keySet().contains(x))
			{
				temp = map.get(x);
				temp = temp+1;
				map.put(x, temp);
			}
			else
			{
				map.put(x,1);
			}
			
			System.out.println("Enter Value");
			is_execute = sc.nextInt();
		}
		for(int value : map.keySet())
		{
			System.out.println(value + " The given Value Comes " + map.get(value)+ " Times");
		}
		sc.close();
	}
}
