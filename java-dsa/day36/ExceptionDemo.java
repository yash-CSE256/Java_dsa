package day36;

public class ExceptionDemo 
{
	public static void main(String[]args) 
	{
		int n=10,d=2;
		int result=div(n,d);
		System.out.println(result);
	}

	private static int div(int n, int d) 
	{
		try 
		{
			int result=n/d;
			return 1;
		}
		catch(ArithmeticException e)
		{
			return 2;
		}
		finally 
		{
			return 3;//this will be returnrd aleays because every try have to run finally even it have exception or not
			
		}
	}

}
