package day17;

import java.util.Scanner;

public class Sumofoddarr
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
		int oddsum=0;
		for(int i=0;arr[i]%2==0;i++) 
		{
			oddsum=oddsum+arr[i];
		}
		System.out.println(oddsum+" is sum of odd no.");
		System.out.println((sum-oddsum)+" is sum of even no.");
		
		

	}

}
