package day60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingbyMap1 {

	public static void main(String[] args) {
		String m="janevary februvary march april may jun july august september octomber november december";
		String arr[]=m.split(" ");
		List<String>li=new ArrayList(Arrays.asList(arr));
		//li.stream().collect(Collectors.groupingBy(m->charAt(m.length()-1)));
		Map<Object, List<String>>map=li.stream().collect(Collectors.groupingBy(mo->mo.charAt(mo.length()-1)));
		
		System.out.println(map);
	}

}
