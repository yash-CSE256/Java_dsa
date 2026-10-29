package day18;
import java.util.Scanner;
public class Mob {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		long mob[]=new long[5];
		for(int i =0;i<5;i++) 
		{
			System.out.println("enter no.");
			mob[i]=sc.nextLong();
		}
		
		for(int i=0;i<5;i++) 
		{
			int even=0;
			int odd =0;
			long no=mob[i];
			while(no>0) 
			{
				long rem=no%10;
				if(rem%2==0) 
				{
					even++;
				}
				else
					odd++;
				no=no/10;
			}
			System.out.println((1+i)+" even= "+even+" \n "+i+"  odd = "+odd);
			if(even>odd)
			System.out.println((i+1)+" even bias");
			else if(odd==even)
				System.out.println((i+1)+" neutral bias");
			else
				System.out.println((i+1)+" odd biased");
			
		}
		

	}

}
