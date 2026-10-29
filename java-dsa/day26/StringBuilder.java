package day26;

public class StringBuilder 
{
	public static void main(String[] args) 
	{
		String s="yash satish gangurde";
		StringBuffer ss=new StringBuffer("yashsatish");
		ss=ss.append("gangurde");
		int cap=ss.capacity();
		System.out.println(cap+""+ss);
		

	}

}
