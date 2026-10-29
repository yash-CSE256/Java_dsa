package day36;

import java.util.Scanner;
public class CheckName2 
{

	public static void main(String[] args) //throws InvalidNameExceptionClass
	{
		System.out.println("enter name");
		Scanner sc=new Scanner(System.in);
		String[] name=new String [3];
		try {
			namecheck(name,sc);
		} catch (InvalidIndex e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	
	}

	private static void namecheck(String[] name,Scanner sc) throws InvalidIndex 
	{
		for(int i=0;i<=name.length;i++) 
		{
			if(i<0||i>=3) 
			{
				throw new InvalidIndex("enter valid index");
			}
		System.out.println((i+1)+" enter name ");
		name[i]=sc.next();
	
		try 
		{
		if(!name[i].matches("[A-Za-z]+"))
		{
			throw new InvalidNameExceptionClass("enter valid name");//user defined
			
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

}
