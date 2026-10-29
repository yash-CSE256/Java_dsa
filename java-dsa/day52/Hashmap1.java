package day52;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap1
{

	public static void main(String[] args) 
	{
		Map<String,Integer>hashmap=new HashMap();
		hashmap.put("yash", 56);
		hashmap.put("jay", 62);
		hashmap.put("ysur", 16);
		hashmap.put("yash", 91);//no duplicate only one key stores it overrides if we write it;
		System.out.println(hashmap.values());System.out.println(hashmap.keySet());System.out.println(hashmap);
		System.out.println();
		String t=" ";
		Set<Entry<String, Integer>>s=hashmap.entrySet();
		System.out.println(s);
		int arr[]=new int[5];
		int i=0;
		for(Entry<String,Integer>ss:hashmap.entrySet()) 
		{
			int arrr=(int) ss.getValue();
			arr[i]=arrr;
			i++;
			
		}
		System.out.println(Arrays.toString(arr));
		
		

	}

}
