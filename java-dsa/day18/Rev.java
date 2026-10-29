package day18;
import java.util.Scanner;
public class Rev 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many no. you want to reverse");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) 
		{
			System.out.println((i+1)+") enter no.");
			arr[i]=sc.nextInt();
		}
		fun(arr);
	}

	private static void fun(int[] arr) {
		for(int i=0;i<arr.length;i++) 
		{
			int no=arr[i];
			int rev=0;
			while(no>0) 
			{
				int rem=no%10;
				rev=rev*10+rem;
				no=no/10;
			}
			arr[i]=rev;
			System.out.println(arr[i]+"");
		}	
	}
}
