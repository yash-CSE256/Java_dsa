package day31;

public class ArrayObjectDriverApp 
{
	public static void main(String[]args)
	{
	ArrayObjectClass ob=new ArrayObjectClass();
	String all=ob.valueAccept("yash", 90, 'A');
	System.out.println(all);
	ArrayObjectClass arr[]=new ArrayObjectClass[5];
	arraymethod(arr);
	String s="yash";
	String m=s;
	s=s.toUpperCase();
	System.out.println(s);
	System.out.println(s==m+"is they point to same object or address");
	boolean e=s.equalsIgnoreCase(m);
	System.out.println(e+"value ignore case");
	
	
	}

	private static void arraymethod(ArrayObjectClass[] arr) 
	{
		for(int i=0;i<5;i++) 
		{
			arr[i]=new ArrayObjectClass();//if constructor is there then it run it first of parent then child
			String all=arr[i].valueAccept(String.format("yash%d",i), i, 'A');
			System.out.println(all);
		}
		
	}

}
