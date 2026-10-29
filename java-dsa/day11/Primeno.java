package day11;
import java.util.Scanner;
public class Primeno {

	public static void main(String[] args) 
	{
		
		System.out.println("enter no.");
		Scanner sc =new Scanner(System.in);
		int n= sc.nextInt();
		int flag =fun(n);
		if(flag==0)
			System.out.println(n+" is prime no");
		else
			System.out.println(n+" is not prime no.");
			
		
	}
	public static int fun(int n) 
	{
		
		int flag=0;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0) 
				flag=1;		
		}
		return flag;
	}

}
