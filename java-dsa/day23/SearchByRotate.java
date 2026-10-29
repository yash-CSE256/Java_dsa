package day23;

public class SearchByRotate 
{
	public static void main(String []args) 
	{
		int arr[]={8,4,2,1,6,3,7,5};
		mergesort(arr,0,arr.length-1);
		
	}

	private static void mergesort(int[] arr, int start, int end)
	{
		if(start<=end) 
		{
			int mid=(start+end)/2;
			mergesort(arr,start,mid);
			mergesort(arr,mid+1,end);
			merge(arr,start,mid,end);
		}
		
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		int i=start;
		int j=mid+1;
		int k=start;
		int zrr[]=new int[arr.length];
		while(i<mid && j<=end) 
		{
			if(arr[i]<arr[j]) 
			{
				zrr[k]=arr[i];
				i++;
				k++;
			}
			else 
			{
				zrr[k]=arr[j];
				j++;
				k++;
			}

			if(i>mid)
			{
				for(int z=j;z<=end;z++)
				{
					zrr[k]=arr[z];
					k++;
				}
			}
			
			if(j>end)
			{
				for(int z=i;z<=mid;z++)
				{
					zrr[k]=arr[z];
					k++;
				}
			}
			
			for(int m=start;m<=end;m++)
				arr[m]=zrr[m];
				
		}
		
	}

}
