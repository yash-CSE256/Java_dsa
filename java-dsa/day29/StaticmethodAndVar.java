package day29;
import java.util.Scanner;
public class StaticmethodAndVar 
{
	private int id;
	private String empName;
	private String arrOfColours[]= {"red","blue","yellow","green","pink"};
	private String colour;
	private static String componyname;
	static 
	{
		componyname="fyt";
	}
	public StaticmethodAndVar(int i) 
	{
		this.id=00;
		this.empName="Unknown";
		this.colour="NA";
	}
	public void acceptValue(int id) 
	{
		this.id=id;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		this.empName=sc.nextLine();
		System.out.println("choose colour 1-red,2-blue,3-yellow,4-green,5-pink"+"\n"+"enter no.to select colour");
		int i=sc.nextInt();
		this.colour=arrOfColours[i-1];
		
	}
	public void displayValue()
	{
		System.out.print(this.id+") ");
		System.out.print(""+this.empName);
		System.out.println(" "+this.colour);
	}
	public void setId(int n) 
	{
		this.id=n;
	}
	public int getId() 
	{
		return this.id;
	}
}

