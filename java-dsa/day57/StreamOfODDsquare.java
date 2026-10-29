package day57;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamOfODDsquare {

	public static void main(String[] args) {
		ArrayList<Integer>li=new ArrayList();
		li.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
		li.stream().filter(l->l%2==1).map(l->l*l).forEach(n->System.out.print(" "+n));

	}

}
