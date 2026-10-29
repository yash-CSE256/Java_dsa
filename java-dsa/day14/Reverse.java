package day14;
import java.util.Scanner;
public class Reverse 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0;
		for(int i=1;n>0;i++) 
		{
			int rem=n%10;
			rev=10*rev+rem;
			n=n/10;
		}
		System.out.println(rev);
	}

}
