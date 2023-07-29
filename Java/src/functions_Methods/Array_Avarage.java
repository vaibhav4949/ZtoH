package functions_Methods;

public class Array_Avarage 
{
	public static void main(String[]args) 
	{
      avarage();
      
      int arr[] = {10,20,30,40,50};
      int av = avarage1(arr,0); 
      
      System.out.println(" Return With Argument");
      System.out.println("The Avarage OF Given Elements is " + av);
	}

	public static void avarage()
	{
		System.out.println("Without Argument");
		
		int sum=0,avg;
		int arr[] = {10,20,30,40,50};

		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}		

		System.out.println("The Sum OF Given Elements is " + sum);

		avg = sum/arr.length;
		System.out.println("The Avarage OF Given Elements is " + avg);
	}
	
	public static int avarage1(int arr[],int sum)
	{				
		int avg;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}		
		
		avg = sum/arr.length;
		return avg;
	}
}
