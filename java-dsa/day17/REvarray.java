package day17;
import java.util.Scanner;

public class REvarray {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println("enter no."+(i+1));
			 arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) 
		{
			int rev=0;
			int no=arr[i];
			while(no>0) 
			{
			int rem=no%10;
			rev=10*rev+rem;
			no=no/10;
			
			}
			arr[i]=rev;
	
				
		}
		for(int i=0;i<arr.length;i++) {
		System.out.println(" "+arr[i]);	
		}
		
	}
	

}
