package day28;

public class Customorinfo implements Comparable<Customorinfo>
{
	private int custID;
	private String custName;
	@Override
	public String toString() {
		return "Customorinfo [custID=" + custID + ", custName=" + custName + ", phoneNo=" + phoneNo + ", emailId="
				+ emailId + "]";
	}

	private long phoneNo;
	private String emailId;
	
	public Customorinfo() 
	{
		
	}
	
	public void acceptValue(int id,String n,long no,String email) 
	{
		this.custID=id;this.custName=n;this.phoneNo=no;this.emailId=email;
	}
	
	public void displayValue() 
	{
		System.out.println(""+String.format("%3d %8s %11d %11s",this.custID,this.custName,this.phoneNo,this.emailId));
	}
	
	public int searchByNo(long searchNo) 
	{
		if(this.phoneNo==searchNo) 
		{
			return this.custID;
		}
		return 0;
	}
	
	public boolean searchByEmail(String email) 
	{
		if(this.emailId==email) 
		{
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(Customorinfo o) {
	
		if((this.custName.compareTo(o.custName)==-1))
		{
		return -1;
		}
		return 1;
	}

}
