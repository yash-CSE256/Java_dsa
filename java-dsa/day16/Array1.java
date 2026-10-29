package day16;
import java.util.Arrays;
public class Array1 
{

	public static void main(String[] args)
	{
		int arr[];
		arr=new int[4];//specify size of array
		arr = new int[] {1,4,7,3,2,5};// initialize after declaration // but it creates or write new array even after declaring size 4
		int a=arr[5];
		System.out.println(a+"");
		System.out.println(Arrays.toString(arr));
		

	}

}
