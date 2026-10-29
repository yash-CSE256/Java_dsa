package day19;
import java.util.Scanner;
import java.util.Arrays;
public class Array2d 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int arr[][];
		arr=new int[5][3];
		for(int i=0;i<5;i++) 
		{
			for(int j=0;j<3;j++) 
			{
				System.out.println(i+" "+j+" enter no.");
				arr[i][j]=sc.nextInt();
				
			}
		}
		System.out.println(Arrays.deepToString(arr));
		for(int i=0;i<5;i++) 
		{
			for(int j=0;j<3;j++) 
			{
				System.out.println(arr[i][j]);
			}
		}
		

	}

}
