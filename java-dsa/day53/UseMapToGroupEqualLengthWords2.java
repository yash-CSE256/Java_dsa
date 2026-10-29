package day53;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UseMapToGroupEqualLengthWords2
{

	public static void main(String[] args) 
	{
		String s="ten one three two five six seven eight four nine";
		String arr[]=s.split(" ");
		Map<Integer,Set<String>>map=new HashMap();
		for(String ss:arr) 
		{
			int key=ss.length();
			map.putIfAbsent(key,new HashSet());
			map.get(key).add(ss);
		}
		System.out.println(map.values());
	}

}
