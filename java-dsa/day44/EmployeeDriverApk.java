package day44;
import java.io.*;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeDriverApk {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException 
	{
		File fl=new File("C:\\Users\\thega\\Downloads\\employee.json");
		boolean s=fl.exists();
		System.out.println(s);
		
		ObjectMapper om=new ObjectMapper();
		ArrayList<Employee>Employyes=null;
		Employyes=om.readValue(fl, new TypeReference< ArrayList<Employee>>() {});
		System.out.println(Employyes);
	}


}
