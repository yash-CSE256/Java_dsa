package day49;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue1
{

	public static void main(String[] args) 
	{
		PriorityQueue<Integer>qu=new PriorityQueue(Collections.reverseOrder());
		qu.addAll(Arrays.asList(5,4,4));
		System.out.println(qu);
		int seconds=0;
		Iterator<Integer> itr=qu.iterator();
		while(!qu.isEmpty()) 
		{
			int j1=qu.remove();// 7
			int j2=0;// 5                                  1 2 3 4 5 6 7
			if(itr.hasNext())                          //  1 2 3 4 5 
 			{                                            //          1 2 3 4 5   
				j2=qu.remove();
				
			}
			if(j1>0 && j2==0) 
			{
				seconds=j1+seconds;
				break;
			}
			
			if(j1 >0 && j2>0) 
			{
				seconds++;
				j1--;
				j2--;
				qu.add(j1);
				qu.add(j2);
			}
		}
		System.out.println(seconds);
	}

}
