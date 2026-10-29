package day53;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GmailGroupByDomain
{
	public static void main(String[]args) 
	{
		String[]mails= {"yash@gmail.com","soham@yahoo.com","mahesh@reddit.com","raj123@gmail.com","chetan@yahoo.com","manish123@reddit.com"};
		Map<String,List<String>>map=new HashMap();
		for(String em:mails) 
		{
			int n=em.indexOf("@");
			String key=em.substring(n,em.length());
			map.putIfAbsent(key,new LinkedList());
			map.get(key).add(em);
		}
		System.out.println(map.values());
	} 

}
