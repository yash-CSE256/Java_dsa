package day53;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class UseMapToGroupEqualLengthWords
{

	public static void main(String[] args) 
	{
		String s="ten one three two five six seven eight four nine";
		String arr[]=s.split(" ");
		Map<String,Integer>map=new HashMap();
		for(String ss:arr) 
		{
			map.put(ss,ss.length());
		}
		System.out.println(map);
		List<String>list=new ArrayList();
		for(Entry<String,Integer> sss:map.entrySet()) 
		{
			list.add(sss.getKey()	);
			int n=sss.getValue();
		}

	}

}
