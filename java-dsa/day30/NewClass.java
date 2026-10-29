package day30;
public class NewClass //extends StudentObjectDriverApp
{

	public static void main(String[] args)
	{
		StudentObjectDriverApp.main(args);//static method using class name parent
		//StudentObject oj=new StudentObject();
		StudentObject objj=new StudentObjectDriverApp();
		objj.displayResult();//
	}
	

	
}