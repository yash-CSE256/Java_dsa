package day10;
import java.util.Scanner;
public class CheckArmstrongno {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int sum=0;
		System.out.println("enter no.");
		int n=sc.nextInt();
		int num=n;
		while (n>0) 
		{
			int rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(num==sum)
			System.out.println(num+" is armstrong");
		else
			System.out.println(num+" is not armstrong");
			
		

	}

}
