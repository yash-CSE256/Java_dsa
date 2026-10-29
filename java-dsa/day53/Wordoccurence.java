package day53;

import java.util.HashMap;
import java.util.Map;

public class Wordoccurence 
{

	public static void main(String[] args) 
	{
	String s="my name i name is name and thats and my is my name ";
	String arr[] =s.split(" ");
	Map<String,Integer>map=new HashMap();
	for(String ss:arr) 
	{
		if(map.containsKey(ss))
		{
			map.put(ss,map.get(ss)+1);
		     //System.out.println(ss);//first reapiting word
			//break;
		}
		else
			map.put(ss,1);
	}
	  System.out.println(map);

	}

}
