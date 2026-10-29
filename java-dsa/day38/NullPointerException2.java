package day38;
public class NullPointerException2 
{
	private int rno;
	private String name;
	
	public NullPointerException2 ()
	{
		
	}
	public NullPointerException2 (int n,String name) throws NullPointerException
	{
		if (name==null) 
		{
			throw new  NullPointerException("enter valid details");
		}
		
		this.name=name;
		this.rno=n;
	}
}
