package day9;
import java.util.Scanner;
public class Sumofdigit {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your no.");
		int num=sc.nextInt();
		int fun=sum(num);
		System.out.println("sum is  "+fun);
		

	}
	public static int sum(int n) 
	{
		int sum=0;
		while(n>9) 
		{
			sum=0;
		while(n>0) 
		{
		    int rem=n%10;
			sum=sum+rem;
			n=n/10;
			
		}
		n=sum;
		}
		return sum;
	}
}
