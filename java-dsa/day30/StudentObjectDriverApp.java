package day30;

public class StudentObjectDriverApp extends StudentObject 
{

	public static void main(String[] args)
	{
		StudentObject obj=new StudentObject();
		System.out.println("first method in main before ");
		obj.acceptResult("yash",83);
		obj.displayResult();
		if(obj.result()==0) 
		{
			System.out.println("you passed");
		}
		else 
		{
			System.out.println("you failed");
		}
		System.out.println("inside method ");
		sum(obj);
		System.out.println("main meto after run sub method");
		obj.displayResult();

	}
	public static void sum(StudentObject obj2) 
	{
		obj2=new StudentObject();// it does not affect value of main object in main 
		                         //create new object and new values are added there
		System.out.println(" sub method in driveapp extra");
		obj2.acceptResult("yashhh", 98);
		obj2.displayResult();
		StudentObject obj3=new StudentObject(obj2);  
		System.out.println("copy constructor");
		obj3.displayResult();
	}

}
