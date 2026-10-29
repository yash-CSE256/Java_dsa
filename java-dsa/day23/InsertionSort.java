package day23;

public class InsertionSort {

	public static void main(String[] args) 
	{
		int arr[]= {11,7,1,2,3,6,5,9,10,4,8};
		System.out.println("before ");
		printarray(arr);
		sort(arr);
		System.out.println("after ");
		printarray(arr);
	}
	
	private static void sort(int[] arr) {
		for(int i =1;i<arr.length;i++) 
		{
			int j;
			int key=arr[i];
			for(j=i-1;j>=0;j--) 
			{ 
				if(arr[j]>key)
					arr[j+1]=arr[j];
				else
				break;
			}
			arr[j+1]=key;
		}
		
	}
	private static void printarray(int[] arr)
	{
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]+",");
		}
	}	

}
