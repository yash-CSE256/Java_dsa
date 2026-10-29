package day18;
import java.util.Scanner;
public class Evenoddnophone 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("no. of phone no. you want to check");
		int size=sc.nextInt();
		long mob[]=new long[size];
		for(int i=0;i<size;i++) 
		{
			System.out.println("enter phone no."+(i+1)+" \n");
			mob[i]=sc.nextLong();
		}
		evenoddcheck(mob,size);	
	}

	private static void evenoddcheck(long[] mob, int size) {
		for(int i=0;i<size;i++) 
		{
			long no=mob[i];
			check(no,i);
			
		}
	}

	private static void check(long no, int i) {
		int even=0;
		int odd=0;
		while(no>0) 
		{
			long rem=no%10;
			if(no%2==0) 
			{
				even++;
			}
			else
				odd++;
			no=no/10;
		}
		show(even,odd,i);
	}

	private static void show(int even, int odd,int i) {
		System.out.println("no."+(i+1)+" has "+even+" even no. and "+odd+" odd no.");
		
		
	}

}
