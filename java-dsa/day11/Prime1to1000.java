package day11;
public class Prime1to1000 
{

	public static void main(String[] args) 
	
	{
		for(int i=1;i<=100;i++) 
	{
			int num=i;
			fun(num);	
	if(fun(num)==0)
			
				System.out.println(num+" is  prime no");
	}
		
		
		
	}
	public static int fun(int num) 

	{
		
			int flag =0;
			
			for(int j=2;j<=Math.sqrt(num);j++) 
			{
				if(num%j==0) 
				{
					flag =1;
				}
			
	}
			return flag;

		
	
	
}


}
