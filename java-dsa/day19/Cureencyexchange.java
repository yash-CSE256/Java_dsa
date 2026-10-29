package day19;
import java.util.Scanner;
import java.util.Arrays;
public class Cureencyexchange
{
	public static void main(String args[]) 
	{
		int arr[]= {500,200,100,50,20,10};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter currency amount you want to change");
		int no=sc.nextInt();
		curuncychange(no,arr);
	}

	private static void curuncychange(int no, int arr[]) 
	{
		int zrr[]=new int[arr.length];
		for(int i=0;i<arr.length&&no>0;i++) 
		{
			zrr[i]=no/arr[i];
			no=no%arr[i];
		}
		show(no,arr,zrr);
		
	}
	public static void show(int no,int arr[],int zrr[]) 
	{
		for(int i=0;i<arr.length;i++) 
		{
		System.out.println((i+1)+") "+arr[i]+" = "+zrr[i]);
		}
		int sum=0;
		for(int i=0;i<zrr.length;i++) 
		{
		sum=sum+zrr[i];
		}
		System.out.println(" total notes= "+sum);
		
		System.out.println("change = "+no);
	}
	

}
