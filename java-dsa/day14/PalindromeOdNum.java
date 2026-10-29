package day14;

public class PalindromeOdNum {

	public static void main(String[] args) 
	{
		int num=121;
		if(palcheck(num)==num) 
		{
			System.out.print("it is palindrome num");
			
		}
		else 
		{
			System.out.print("not palindrome num");
			
		}
	}

	private static int palcheck(int num) 
	{
		
		int rev = 0;
		while(num>0) 
		{
			int rem=num%10;
			rev=10*rev+rem;
			num=num/10;
			
		}
		return rev;
		
	}

}
