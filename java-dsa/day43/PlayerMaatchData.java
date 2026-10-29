package day43;

public class PlayerMaatchData
{
	private int pno;
	private String name;
	private int count;
	
	
	public PlayerMaatchData() {}
	
	public PlayerMaatchData(int pno,String name,int count) 
	 {
		 this.pno=pno;this.name=name;this.count=count;
	 }
	
	public void setPno(int pno) 
	{
		this.pno=pno;
	}
	public int getPno() 
	{
		return this.pno;
	}
	public void setName(String name) 
	{
		this.name=name;
	}
	public String getName() 
	{
		return this.name;
	}
	public void setCount(int count) 
	{
		this.count=count;
	}
	public int getCount() 
	{
		return this.count;
	}
	public String toString() 
	{
		return "player no- "+this.pno+", name= "+this.name+",  match played=  "+this.count+"\n";
		
	}
	

}
