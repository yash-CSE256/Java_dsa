package day20;
import java.util.Arrays;
import java.util.Scanner;
public class Array2dsum 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no of row");
		int r1=sc.nextInt();
		System.out.println("enter no of column");
		int c1=sc.nextInt();
		int arr[][]=new int [r1][c1];
		for(int i=0;i<r1;i++) 
		{
			for(int j=0;j<c1;j++) 
			{
				System.out.println(i+" "+j+" "+") enter no row-"+(i+1)+" column-"+(j+1));
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(arr));
		int sum=0;
		for(int i=0;i<r1;i++) 
		{
			for(int j=0;j<c1;j++) 
			{
				sum=sum+arr[i][j];
			}
		}
		System.out.println("total sum is "+sum);
		sum=0;
		int k=0;
		for(int i=0;i<r1;i++) 
		{
			sum=0;
			for(int j=0;j<c1&&i==k;j++) 
			{
				sum=sum+arr[i][j];
			}
			k++;
			System.out.println("sum of "+(k)+" row is "+sum);
		}

	}

}
