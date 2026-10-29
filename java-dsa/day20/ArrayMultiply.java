package day20;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayMultiply 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. of rows of arr1");
		int r1=sc.nextInt();
		System.out.println("enter no. of columns arr1");
		int c1=sc.nextInt();
		System.out.println("enter no. of rows arr2");
		int r2=sc.nextInt();
		System.out.println("enter no. of columns arr2");
		int c2=sc.nextInt();
		if(c1==r2) 
		{
			int arr1[][]=new int[r1][c1];
			int arr2[][]=new int[r2][c2];
			int arr3[][]=new int[r1][c2];
			for(int i=0;i<r1;i++) 
			{
				for(int j=0;j<c1;j++) 
				{
					System.out.println(" "+i+" "+j+" "+"enter no. of arr1");
					arr1[i][j]=sc.nextInt();
					
				}
			}
			for(int i=0;i<r1;i++) 
			{
				for(int j=0;j<c1;j++) 
				{
					System.out.println(" "+i+" "+j+" "+"enter no. of arr1");
					arr2[i][j]=sc.nextInt();
					
				}
			}
			System.out.println(Arrays.deepToString(arr1)+"\n"+Arrays.deepToString(arr2));
			fun(arr1,arr2,r1,c1,r2,c2,arr3);
			
		}
		else{
			System.out.println("impossible");
			}
		
	}

	private static void fun(int[][] arr1, int[][] arr2,int r1,int c1,int r2,int c2,int arr3[][]) {
		for(int i=0;i<r1;i++) 
		{
		
			for(int j=0;j<c2;j++) 
			{
				int sum=0;
				for(int k=0;k<c1;k++) 
				{
					sum+=arr1[i][k]*arr2[k][j];
				}
				arr3[i][j]=sum;
			}
		}
		System.out.println(Arrays.deepToString(arr3));
		
	}

}
