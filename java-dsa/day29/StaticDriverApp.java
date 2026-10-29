package day29;

public class StaticDriverApp {

	public static void main(String[] args)
	{
		//StaticmethodAndVar st1=new StaticmethodAndVar();
		//st1.acceptValue();
		//st1.setId(23);		
		//System.out.println(st1.getId());
		//st1.displayValue();
		
		StaticmethodAndVar emplyees[]=new StaticmethodAndVar[2];
		acceptArray(emplyees);
		displayArray(emplyees);
		

	}
	public static void acceptArray(StaticmethodAndVar arr[]) 
	{
		for(int i=0;i<arr.length;i++) 
		{
			arr[i]=new StaticmethodAndVar(i);
			arr[i].acceptValue(i);
		}
	}
	public static void displayArray(StaticmethodAndVar arr[]) 
	{
		for(int i=0;i<arr.length;i++) 
		{
			arr[i].displayValue();
		}
	}
	

}
