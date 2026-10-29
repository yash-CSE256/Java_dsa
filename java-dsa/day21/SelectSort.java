package day21;
import java.util.Arrays;
public class SelectSort {

	public static void main(String[] args) {
	int arr[]= {10,6,31,1,4,7,24,5,51,9,64};
	for(int i=0;i<arr.length;i++) 
	{
		for(int j=i+1;j<arr.length;j++) 
		{
			if(arr[i]>arr[j])
			{
			int temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
			}
			else
				continue;
		}
		
	}
	System.out.println(Arrays.toString(arr));

	}

}
