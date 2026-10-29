package day36;

import java.util.Scanner;
public class CheckName {

	public static void main(String[] args) //throws InvalidNameExceptionClass
	{
		System.out.println("enter name");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		try 
		{
		if(!name.matches("[A-Za-z]+"))
		{
			throw new InvalidNameExceptionClass("enter valid name");
			
		}
		
		System.out.println("name submitted");
		
		}
		
		catch( InvalidNameExceptionClass ex)
		{
			System.out.println(ex.getMessage());
		}
		finally 
		{
			System.out.println("Thank you");// always execute even exception occur or not 
		}
	}

}
