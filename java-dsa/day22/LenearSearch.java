package day22;

public class LenearSearch {

	public static void main(String[] args) {
		int arr[]= {8,5,8,2,9,5,1,4,0};
		int search=0;
		for(int i =0;i<arr.length;i++) 
		{
			if(arr[i]==search) 
			{
				System.out.println("fount at index "+i);
				return;
			}
			
		}
		System.out.println("not found");
	
	}

}
