package day22;

public class Binarysort {

	public static void main(String[] args) {
		int arr[]= {1,5,8,9,14,54};
		int t=14;
		int end=arr.length;
		int start=0;
		int ans=sort(arr,t,start,end);
		if (ans==0) 
		{
			System.out.println("not found");
		}
		else
			System.out.println("found at "+ans);
			
	}

	private static int sort(int[] arr,int t,int start,int end) 
	{
		if(start<=end) 
		{
			int mid=(start+end)/2;
			if(arr[mid]==t) 
			{
				return mid;
			}
			else if(arr[mid]>t)
			{
				return sort(arr,t,start,mid-1);
			}
			else 
			{
				return sort(arr,t,mid+1,end);
			}
		}
		
		return 0;
	}

}
