package day18;
import java.util.Scanner;
public class Shp
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int arr[]=new int[7];
		for(int i =0;i<=6;i++) 
		{
			System.out.println((i+1)+" no.");
			arr[i]=sc.nextInt();
		}
		System.out.println("enter target ");
		int target =sc.nextInt();
		int sum=0;
		for(int i=0;i<=6;i++) 
		{
			sum=sum+arr[i];
			if(target<=sum) 
			{
				System.out.println("target is acheved at "+(i+1)+"th day");
				
			}
			else
				System.out.println("mission impossible");
				break;
		}
		
		
		}
		

	}


