package day22;

public class BinarySearch
{
	public static void main(String[] args) 
	{
		int arr[]= {1,5,7,8,17,64,67,99};
		int s=999;
		int ans=binaysort(arr,s);
		if(ans==0) 
		{
			System.out.println("not found");
		}
		else
			System.out.println("found at "+	ans);
	}

	private static int binaysort(int[] arr, int s) 
	{
		int start=0;
		int end=arr.length-1;
		int steps=0;
		while(arr[start]<arr[end]) 
		{
			steps++;
			int mid=(end+start)/2;
			if(s==arr[mid]) 
			{
				System.out.println("found at steps-"+steps);
				return mid;
			}
			else if(arr[mid]<s) 
			{
				start=mid+1;
			}
			else 
			{
				end=mid-1;
			}
		}
		System.out.println("need "+steps+" steps");
		return 0;
	}

}
