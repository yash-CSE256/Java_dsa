package day32;
import java.util.Scanner;
public class EmpInheritance 
{
	protected int id;
	protected String name;
	protected int age;
	protected int salary;
	
	protected static String batchName;
	static 
	{
		batchName="b1";
	}
	public EmpInheritance() 
	{
		this.id=00;
		this.name="Unknown";
		this.age=00;
		this.salary=00;
	}
	public EmpInheritance(int salary) 
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.salary=salary;
		System.out.println(""+this.id+") |"+this.name+" | "+this.age+" | "+this.salary+" | "+this.batchName+"|");

	}
	public void accept() 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter id");
		this.id=sc.nextInt();
		
		System.out.println("enter name");
		this.name=sc.nextLine();
		System.out.println("enter age");
		this.age=sc.nextInt();
		System.out.println("enter salary");
		this.salary=sc.nextInt();
		
	}
	public void displayValue()
	{
		System.out.println(""+this.id+") |"+this.name+" | "+this.age+" | "+this.salary+" | "+this.batchName+"|");
	}
		
}
