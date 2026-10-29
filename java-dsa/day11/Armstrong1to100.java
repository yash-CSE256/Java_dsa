package day11;

public class Armstrong1to100 
{

	public static void main(String[] args)
	{
		int count=0;
		
		for(int i=1;i<=1000;i++) 
		{
			int fun=arm(i);
			if(fun==i) 
			{
				System.out.println(i+" is armstrong no.");
			}
			else
				System.out.println(i+" is not armstrong no.");
			if(fun==i)
				count++;
				
		}
		System.out.println(count+" are total armstrong no.");

	}
	static int arm(int n) 
	{
		int sum=0;
		while(n>0) 
		{
			int rem=n%10;
			sum =sum+(rem *rem *rem);
			n=n/10;
		}
		return sum;
	}

}
