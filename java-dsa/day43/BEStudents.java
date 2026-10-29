package day43;

public class BEStudents 
{
	private int rolNo;
	private String name;
	private boolean result;

	
		public BEStudents(){}

		public BEStudents(int rno,String name,boolean result)
		{
			this.name=name;
			this.result=result;
			this.rolNo=rno;
		}
		public String toString() 
		{
			return "rno- "+this.rolNo+" name- "+this.name+" result- "+(this.result?"pass":"fail");
			
		}
		

	

}
