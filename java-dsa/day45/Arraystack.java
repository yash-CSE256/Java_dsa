package day45;
public class Arraystack
{

	public static void main(String[] args) 
	{
		int heights[]= {7,9,2,8,99,94,8,2,1,7,2};
		int left =0;
		int right=heights.length-1;
		int max=0;
		int area=0;
		while(left<=right) 
		{
			int height=Math.min(heights[left],heights[right]);
			int width=right-left;
			area=height*width;
			if(area>max) 
			{
				max=area;
				
			}
			if(heights[left]<heights[right]) 
			{
				left++;
			}
			else 
			{
				right--;
			}
			
			System.out.println(max);
			
		}
		

	}

}
