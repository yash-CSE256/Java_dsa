package day40;
import java.io.Serializable;

public class SstudentClass implements Serializable
{
	@Override
	public String toString() {
		return "SstudentClass [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	private int id;
	private String name;
	private double marks;
	
	
	
	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final double getMarks() {
		return marks;
	}

	public final void setMarks(double marks) {
		this.marks = marks;
	}

	public SstudentClass(int n,String name,double m) 
	{
		this.id=n;this.name=name;this.marks=m;
	} 
	
	

}
