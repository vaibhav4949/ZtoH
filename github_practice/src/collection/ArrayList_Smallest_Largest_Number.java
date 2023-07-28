package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Smallest_Largest_Number 
{
	public static void main(String[]args) 
	{
		int arr[] = {10,20,-100,0,50}; 
		List<Integer> al = new ArrayList<>();

		for(int i=0;i<al.size();i++)
		{
			al.add(al.get(i));
		}

		int small = arr[0];
		int large = arr[0];

		for(int i=1;i<arr.length;i++)
		{
			if(small>arr[i])
			{
				small = arr[i];
			}
			else if(large<arr[i])
			{
				large = arr[i];
			}
		}
		System.out.println("The Smallest Number OF Given Array is " + small);
		System.out.println("The Largest Number OF Given Array is " + large);
	}
}
