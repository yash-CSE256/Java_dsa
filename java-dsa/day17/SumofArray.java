package day17;
import java.util.Scanner;
public class SumofArray 
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
		int sum=0;
		for(int i=0;i<arr.length;i++) 
		{
			sum=sum+arr[i];
			
		}
		System.out.println(sum+" ");

	}

}
