package day26;
import java.util.Arrays;
public class CountIntegerInString 
{

	public static void main(String[] args)
	{
		String name="my name is yash and my age is 34 and id is 24 and year is 2026 ";
		String namee[]=name.split(" ");
		System.out.println(Arrays.toString(namee));
		int count =0;
		for(int i =0;i<namee.length;i++) 
		{
			try 
			{
				Integer.parseInt(namee[i]);//automatic throws when string occur
				if(!(namee[i].matches("\\d+"))) //throwing expilicitly using condition
				{
				throw new RuntimeException();
				}
				count++;
				System.out.println(namee[i]+"  is num");
			}
			
			catch(NumberFormatException e) 
			{
				System.out.println(namee[i]+" is not num");
			}
			catch(RuntimeException e) 
			{
				System.out.println(namee[i]+" runtime catch its not num");
			}
			
			
		}
		System.out.println(count+" are total num");

	}

}
