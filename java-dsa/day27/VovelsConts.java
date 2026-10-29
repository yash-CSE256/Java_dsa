package day27;

public class VovelsConts 
{

	public static void main(String[] args) 
	{
		String vovels="aeiou";
		char[]zrr=vovels.toCharArray();
		String name="yash satish gangurde";
		char[] arr=name.toCharArray();
		System.out.println(arr);
		int vovelCount=0;
		for(int i =0;i<arr.length;i++) 
		{
			for(int j=0;j<zrr.length;j++) 
			{
				if(arr[i]==zrr[j]) 
				{
					vovelCount++;
				}
			}
		}
		System.out.println("total vovels count = "+vovelCount);


	}

}
