package day57;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfAllOddSquareNo {

	public static void main(String[] args) 
	{
		List<Integer>li=new ArrayList(Arrays.asList(1,2,3,4,5,6,7,8,9));
		li.stream().filter(n->n>5).forEach(n->System.out.println(n));
		
		int ans=li.stream().filter(n->n%2==1).map(n->n*n).reduce(0,(acc,n)->acc+n);
		System.out.println(ans);

	}

}
