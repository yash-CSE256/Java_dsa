package day28;

public class Suppliar 
{
	private String SupliarName1;
	private String phoneNo;
	private String email;
	private boolean available;
	public void accept()
	{
		SupliarName1="yash";
		phoneNo="7058297251";
		email="thegangurdeyash14@gmail.com";
		available=false;
		
		
	}
	public void display() 
	{
		System.out.println(SupliarName1);
		System.out.println(phoneNo);
		System.out.println(email);
		System.out.println("cod is "+(available ?" ":"not"+" available"));
		
		
	}
	

}
