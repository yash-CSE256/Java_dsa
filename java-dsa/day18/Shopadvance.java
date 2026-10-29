package day18;
import java.util.Arrays;
import java.util.Scanner;
public class Shopadvance {
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. days shop is open");
		int days=sc.nextInt();
		int arr[]=new int[days];
		for(int i=0;i<days;i++)
		{
		System.out.println("enter income of day"+(i+1));
		arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("enter no. of targets you want check ");
		int targetsize=sc.nextInt();
		fun1(arr,targetsize);
	}
	public static void fun1(int arr[],int t) 
	{
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<t;i++) 
		{
			System.out.println("enter target no. "+(i+1));
			int target =sc.nextInt();
			fun2(arr,target);
		}
	}
	private static void fun2(int arr[],int target) {
		int flag=0;
		int sum=0;
		for(int i=0;i<=arr.length;i++) 
		{
			sum=sum+arr[i];	
			if(target<=sum) 
			{
				System.out.println("target is acheved at day "+(i+1));
				flag=1;
				break;
			}
		}
		if(flag==0){
			System.out.println("impossible");
			}
		
	}

}
