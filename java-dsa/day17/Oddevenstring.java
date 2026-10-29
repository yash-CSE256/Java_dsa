package day17;
import java.util.Scanner;
public class Oddevenstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter youe phon no.");
		String no= sc.nextLine();
		int odd=0;
		int even=0;
		for(int i=0;i<no.length();i++) 
		{
			char c= no.charAt(i);
			int digit = Character.getNumericValue(c);

			if(digit%2==1) 
			{
				odd++;
			}
			else if(digit%2==0) 
			{
				even++;
			}
			
		}
		System.out.println("even no. are "+even);
		System.out.println("odd no. are "+odd);
		if(odd ==even)
		{
			System.out.println("neutral bias");
		}			
		else if(odd>even)
		{
			System.out.println("odd biased");
		}
		else
			System.out.println("even biased");

	}

}
