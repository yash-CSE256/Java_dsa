package day8;
import java.util.Scanner;
public class Choclate1to5sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int max=20;
		for(int no=1;no<=5;no++) 
		{
			System.out.println("enter chocolate roll no."+no+"baught");
			int chocolate=sc.nextInt();
			sum=sum+chocolate;
			  
			if(sum>=max) 
			{
				System.out.println("total chocolates are"+sum);
				break;	
			}
			
			
		}
		System.out.println("extra chocolates are "+(sum-max));
		
	

	}

}
