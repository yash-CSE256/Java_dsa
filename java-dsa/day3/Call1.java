package day3;
import java.util.Scanner;
public class Call1 
{

	public static void main(String[] args) 
	{
	Scanner sc =new Scanner(System.in);
	System.out.println("enter radius");
	int r=sc.nextInt();
	double a= 3.14*r*r;
	System.out.println("area is "+a);
	sc.close();
	}
	
}
