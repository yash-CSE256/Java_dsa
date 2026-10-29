package day17;
import java.util.Scanner;

public class ODDeven
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println("enter "+(i+1)+" no.");
			 arr[i]=sc.nextInt();
		}
		int evensum=0;
		for(int i=0;i<size;i++) 
		{
			if(arr[i]%2==0) 
			{
				evensum=evensum+arr[i];				
			}
			
		}
		System.out.println("sum of even no. is  "+evensum);
		
		

	}

}
