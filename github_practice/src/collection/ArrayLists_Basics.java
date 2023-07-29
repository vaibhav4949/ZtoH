package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrayLists_Basics 
{
	public static void main(String[]args) 
	{
		List<Integer> list = new ArrayList<>();

		// Add Elements.

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);	
		System.out.println(list);

		//1.To Get An Elements.
		int ele = list.get(0);             // 0 is index
		System.out.println(ele);

		//2.Add Element in between		
		list.add(2,0);                 // 2 is index and 0 is element to be added.
		System.out.println(list);

		//3.Set Element
		list.set(0,5);               // 0 is index and 5 is element which is change in first index
		System.out.println(list);

		//4.Delete element
		list.remove(1);             // 1 is index,here we delete the element of 1st index.
		System.out.println(list);

		//5.Size Of List
		//	int size = list.size();    // This will show you the size of list.		
		//	System.out.println(size);
		System.out.println(list.size());

		//6.Loops on list
		for(int i=0;i<list.size();i++) // This will show you all elements inside list.
		{
			System.out.print(list.get(i) + " ");
		}
		System.out.println();

		//7.Sorting the list.        	
		Collections.sort(list);       // This Will show you all elements in in ascending order.
		System.out.print(list);
		System.out.println();

		//8.To check value.
		System.out.println(list.contains(6));   // This Will check the elements are present

		//9.Delete All elements.
		list.clear();                     // This will Delete all the elements.
		System.out.println(list);

		//10.To check it is empty or not.
		System.out.println(list.isEmpty());
	}
}
