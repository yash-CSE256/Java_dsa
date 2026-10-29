package day22;

public class Search2fun {

	public static void main(String[] args) 
	{
		int arr[]= {4,5,1,3,7,6};
		int s=3;
		search(arr,s);
		if(search(arr,s)==true) 
		{
			System.out.println("found");
		}
		else
			System.out.println("not found");

	}

	private static boolean search(int[] arr, int s) {
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]==s)
				return true;
		}
		
		return false;
	}

}
