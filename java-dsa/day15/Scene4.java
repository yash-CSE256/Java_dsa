package day15;
import java.util.Scanner;
public class Scene4 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.");
		int n=sc.nextInt();
		primeCheck(n);
		if(primeCheck(n)==1)
			System.out.println(n+" is not prime no");
		else
			System.out.println(n+" is prime no");
			
	}
	public static int primeCheck(int n) 
	{
		int flag = 0;
		for(int i=2;i<=Math.sqrt(n);i++) 
		{
			if(n%i==0)
				flag=1;
		}
		return flag;
	}

}
