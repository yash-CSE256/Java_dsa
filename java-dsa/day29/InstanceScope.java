package day29;
import java.util.Scanner;
public class InstanceScope 
{
	Scanner sc=new Scanner(System.in);
	private int rno;
	private String stName;
	private Double per;
	static String batchName;
	static 
	{
		batchName ="B13";
	}

	public void accept() 
	{
		System.out.println("enter rol no.");
		this.rno=sc.nextInt();
		sc.nextLine();
		System.out.println("Student name");
		this.stName=sc.nextLine();
		System.out.println("enter percentage");
		this.per=sc.nextDouble();
		sc.close();
	}
	public void display() 
	{
		System.out.println(this.rno);
		System.out.println(this.stName);
		System.out.println(this.per);
		
	} 
	public static void batchdisplay()
	{
		System.out.println(InstanceScope.batchName);
	}
	public void SetRno(int rno)
	{
		this.rno=rno;
	}
	public int getRno() 
	{
		return rno;
	}

}
