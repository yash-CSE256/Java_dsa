package day9;
import java.util.Scanner;
public class Oddsum {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your phon no..");
		long n = sc.nextLong();
		long rem=n%10;
		int odd=0;
		int even=0;
		
		for(int i=1;i<=10;i++)
		{
			rem =n%10;
		if(rem%2==1) 
		{
			odd++;
			n=n/10;
		}
		else if(rem%2==0) 
		{
			even++;
			n=n/10;
		}
		
		}
		if (odd==even) 
		{
			System.out.println("neutral bias");
		}
		else if (odd>even) 
		{
			System.out.println("odd bias");
		}
		else
			System.out.println("even bias");
		System.out.println("in this no. odd digits are  "+odd);
		System.out.println("in this no. even digits are  "+even);
		}

}
