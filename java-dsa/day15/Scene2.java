package day15;
import java.util.Scanner;
public class Scene2 {

	public static void main(String[] args) 
	{
		
		primeCheck();

	}
	public static void primeCheck() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. to check prime");
		int n=sc.nextInt();
		int flag =0;
		for(int i=2;i<=n/2;i++) 
		{
			if(i%n==0) 
			{
				flag =1;
			}
		}
		if(flag ==1) 
		{
			System.out.println(n+"  is not prime no");
		}
		else
			System.out.println(n+" is prime no");
		
	}

}
