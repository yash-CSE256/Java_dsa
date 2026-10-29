package day31;

public class ArrayObjectClass 
{
	private String name;
	private int rno;
	private char div;
	
	String valueAccept(String name,int rno,char c)
	{
		this.name=name;this.rno=rno;this.div=c;
		String all=String.format("%-5s %5d %5c",name,rno,c);
		return all;
		
	}

}
