package day6;
import java.util.Scanner;
public class Orr 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your gender [if male=1 ,female=0]");
		int gender=sc.nextInt();
		System.out.println("enter your age ");
		int age=sc.nextInt();
		System.out.println("enter your height");
		double height = sc.nextDouble();
		System.out.println("is your father or relatives are in industry");
		int nep=sc.nextInt();
		
		if((gender ==1 ) && ((age <=21 && height >=6.2) || (nep ==1)))
		{
			System.out.println("male Eligible for Modeling");
		}
		else if((gender ==0 ) && ((age <=19 && height >=5.6) || (nep ==1)))		
		{
			System.out.println("female Eligible for Modeling");
		}
		else 
		{
			System.out.println("not Eligible for Modeling");
		}
		
		sc.close();
	}
	

}
