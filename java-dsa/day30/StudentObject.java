package day30;
public class StudentObject 
{
	private String stName;
	private double marks;
	
	public StudentObject(StudentObject obj2) 
	{
		this.marks=obj2.marks;
		this.stName=obj2.stName;
	
		
	}
	public StudentObject() 
	{
		
	}
	void acceptResult(String name,double marks) 
	{
		this.stName=name;
		this.marks=marks;
	}
	void displayResult() 
	{
		System.out.println("Student name - "+this.stName);
		System.out.println("Student marks - "+this.marks);
	}
	int result() 
	{
		int flag=0;
		if(this.marks<40) 
		{
			flag=1;
		}
		return flag;
	}

	
	
	
	
	
	
}
