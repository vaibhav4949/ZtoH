package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Descending_order 
{
	public static void main(String[]args) 
	{
		int arr[] = {0,50,-1,70,31};
		int temp=0;

		List<Integer> al = new ArrayList<>();

		for(int i=0;i<arr.length;i++)
		{
			al.add(arr[i]);
		}	
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
