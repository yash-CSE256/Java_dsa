package day43;
import java.util.ArrayList;
import java.util.Arrays;
public class AraryList2 
{

	public static void main(String[] args) 
	{
		String arr[]= {"yash","mahesh","jay"};
		String brr[]= {"mba1","mba2","mba3"};
		
		ArrayList<String> Student=new ArrayList<>(Arrays.asList());
		Student.addAll(Arrays.asList(arr));
		//Student.add(brr);
		//System.out.println(Arrays.toString(Student.get(0)));
		System.out.println(Student.get(0));
		
		listofObject();

	}

	private static void listofObject() 
	{

		BEStudents it1=new BEStudents (1,"yash",true);
		BEStudents it2=new BEStudents (2,"jay",false);
		
		BEStudents cs1=new BEStudents (10,"mayuri",false);
		BEStudents cs2=new BEStudents (11,"omkar",true);
		
		ArrayList <BEStudents> it=new ArrayList<>();
		it.addAll(Arrays.asList(it1,it2));
		
		ArrayList<BEStudents> cs=new ArrayList<>();
		cs.add(cs1);
		cs.add(cs2);
		
		ArrayList<BEStudents> st=new ArrayList<>();
		st.addAll(it);
		st.addAll(cs);
		System.out.println(st.get(0));
		
	}

}
