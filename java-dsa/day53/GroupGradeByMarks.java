package day53;

import java.util.List;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

public class GroupGradeByMarks 
{

	public static void main(String[] args)
	{
		Map<String,Integer>st=new LinkedHashMap();
		st.put("yash",50);
		st.put("soham",30);
		st.put("rahul",66);
		st.put("nitin",34);
		st.put("jay",76);
		st.put("manish",86);
		st.put("omkar", 45);
		Map<String,List<String>>map=new HashMap();
		for(Entry<String,Integer>s:st.entrySet()) 
		{
			if(s.getValue()>80) 
			{
				map.putIfAbsent("FirstClass", new LinkedList());
				map.get("FirstClass").add(s.getKey());
			}
			else if(s.getValue()>=35) 
			{
				map.putIfAbsent("SecondClass", new LinkedList());
				map.get("SecondClass").add(s.getKey());
			}
			else 
			{
				map.putIfAbsent("fail", new LinkedList());
				map.get("fail").add(s.getKey());
			}
				
			
		}
		System.out.print(map);
		



	}

}
