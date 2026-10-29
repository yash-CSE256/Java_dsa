package day28;
import java.util.Scanner;
public class CustomerDriverApp {

	public static void main(String[] args)
	{
		long searchno=765746475;
		Customorinfo cust[]=new Customorinfo[3];
		for(int i=0;i<cust.length;i++) 
		{
			cust[i]=new Customorinfo();
			aceept(cust[i]);
			cust[i].displayValue();
		}
		for(int i=0;i<cust.length;i++) 
		{
			cust[i].displayValue();
		}
		int flag=0;
		for(int i=0;i<cust.length;i++) 
		{
			flag=cust[i].searchByNo(searchno);
		}
		if (flag==0) 
		{
			System.out.println("not found");
		}
		else
			System.out.println("found at id "+flag);
		

	}

	private static void aceept(Customorinfo c) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("enter phone");
		long phone=sc.nextLong();
		sc.nextLine();
		System.out.println("enter email id");
		String  email=sc.nextLine();
		
		
		
		
		c.acceptValue(id,name,phone,email);
		
	}

}
