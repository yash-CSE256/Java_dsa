package day8;
import java.util.Scanner;
public class Insurancecalc 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your gender []if male = 1, if female = 0");
		int gender = sc.nextInt();
		System.out.println("Enter your age ");
		int age = sc.nextInt();
		System.out.println("enter your qualification : if only graduate =0,if post graduate =1");
		int qualification = sc.nextInt();
		System.out.println("Enter your Sallary ");
		int sallary = sc.nextInt();
		if(gender ==1 && age<=30 && qualification==1)
		{
			System.out.println("male :you are eligible for insurance ");
			
		}
		else if(gender ==0 && age<=25 && qualification==0 || qualification==1) 
		{
			System.out.println("female :you are eligible for insurance ");
			
		}
		else 
			System.out.println("you are not eligible for insurance ");
		

	}

}
