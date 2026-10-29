package day23;

public class FactorialByRecursion {

	public static void main(String[] args) {
		int n=4;
		int ans=1;
		System.out.println(rec(n,ans));
		System.out.println(rec2(n));
		
	}

	private static int rec2(int n) 
	{
		if(n==1) 
		{
			return 1;
		}
		
	
		return n*rec2(n-1);
	}

	private static int  rec(int n,int ans)
	{
		
		if(n==1) 
		{
			return ans;
		}
		
			return rec(n-1,ans*n);
		
		
				
		
	
	}


}
