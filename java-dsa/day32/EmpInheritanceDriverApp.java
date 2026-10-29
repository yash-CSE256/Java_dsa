package day32;
import java.util.Scanner;
public class EmpInheritanceDriverApp 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("is emp vip enter true or false");
		boolean em=sc.nextBoolean();
		if(em ==true) 
		{
			VipEmp vEmp=new VipEmp();
		}
		else {
		 EmpInheritance emp=new  EmpInheritance();
		}

	}

}
