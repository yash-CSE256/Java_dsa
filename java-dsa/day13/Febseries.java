package day13;
import java.util.Scanner;
public class Febseries {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of series to print");
		int n=sc.nextInt();
		int no1=0;
		int no2=1;
		System.out.println(no1 +"\n"+no2);
		for(int i=3;i<=n;i++) 
		{
			int no3=no1+no2;
			no1=no2;;
			no2=no3;
			System.out.println(no3+"");
			
		}
		
		
		
	}

}
