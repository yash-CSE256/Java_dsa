package day8;
import java.util.Scanner;
public class Evenoddchocolate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max=20;
		int sum=0;
		for(int no=1;no<=5;no++) 
		{
			System.out.println(no+")enter no of chocolate you baught");
			int choco =sc.nextInt();
			if((no%2==1 && choco%2==0) || (no%2==0 && choco%2==1) )
			{
				sum=sum+choco;
			}
			else 
			{
				continue;
			}
			if(sum>=20 )
			{
				break;
			}
		}
		System.out.println("total chocolates ="+sum+" and   extra chocolates"+(sum - max));
		

	}

}
