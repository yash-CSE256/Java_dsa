package day3;

public class CallByreff {

	public static void main(String[] args) {
				int arr[]= {10,20};									
				System.out.println(arr[0]);		//10				10	
				demo(arr);						//call by ref
				System.out.println(arr[0]);	//99
			}

			private static void demo(int brr[]) 	//OG
			{
				System.out.println(brr[0]); //10
				brr[0]=99;
				System.out.println(brr[0]); //99
			}
		
		

	}


