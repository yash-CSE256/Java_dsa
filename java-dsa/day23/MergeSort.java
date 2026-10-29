package day23;

import java.util.Arrays;

public class MergeSort 
{

	public static void main(String[] args) 
	{
		int arr[]={9,4,7,1};
		mergesort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	private static void mergesort(int[] arr, int start, int end)
	{
		if(start<end) 
		{
			int mid=(start+end)/2;
			mergesort(arr,start,mid);
			mergesort(arr,mid+1,end);
			merge(arr,start,mid,end);
		}
		
	}

	private static void merge(int[] arr, int start, int mid, int end) 
	{
		int i=start;
		int j=mid+1;
		int k=start;
		int []brr=new int[arr.length];
		while(i<=mid&&j<=end) 
		{
			if(arr[i]>arr[j]) 
			{
				brr[k]=arr[j];
				j++;
				k++;
			}
			else 
			{
				brr[k]=arr[i];
				i++;
				k++;
			}
		}
		if(j>end) 
		{
			for(int z=i;z<=mid;z++){
			brr[k]=arr[z];
			k++;}
		}
		if(i>mid) 
		{
			for(int z=j;z<=end;z++) 
			{
				brr[k]=arr[z];
				k++;
			}
		}
		for(int l=start;l<=end;l++) {
		arr[l]=brr[l];
		}
	}

}
