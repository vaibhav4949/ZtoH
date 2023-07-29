package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Avarage 
{
	public static void main(String[]args) 
	{
		int arr[] = {1,2,3,4,5};
		int sum=0,avg;

		List<Integer> al = new ArrayList<>();

		for(int i=0;i<arr.length;i++)
		{
			al.add(arr[i]);
			sum=sum+arr[i];
		}	
			
		System.out.println("The Sum OF Given Elements is " + sum);

		avg = sum/arr.length;
		System.out.println("The Avarage OF Given Elements is " + avg);
	}
}
