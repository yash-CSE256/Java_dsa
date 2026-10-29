package day21;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {8,5,2,4,1,6,7,3};
		System.out.println("before ");
		printarray(arr);
		sortArray(arr);
		System.out.println("after ");
		printarray(arr);

	}

	private static void sortArray(int[] arr) {
		for(int i =1;i<arr.length;i++) 
		{
			for(int j=0;j<arr.length-i;j++) 
			{
				if (arr[j]>arr[j+1]) 
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	}

	private static void printarray(int[] arr) {
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println(","+arr[i]);
		}
		
	}

}
