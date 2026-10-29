package day48;
import arraydemoCustomerClass.Customorinfo;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeListComparatorForCustomOrderOfObject
{

	public static void main(String[] args) 
	{
		Set<Customorinfo>set=new TreeSet();
		Customorinfo s1=new Customorinfo();
		Customorinfo s2=new Customorinfo();
		Customorinfo s3 =new Customorinfo();
		s1.acceptValue(4, "ysh", 56, "yguwyg");
		s2.acceptValue(2, "samay", 98, "hfguyfu");
		s3.acceptValue(8, "goat", 89, "ugif");
		set.addAll(Arrays.asList(s1,s2,s3));
		System.out.println(set);
		
		
		
		
		
		
	}
}
