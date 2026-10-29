package day11;

public class MaxPrefix {

	public static void main(String[] args) 
	{
		String []words= {"flower","flow","flown"};
		String prefix= words[0];
		for(int i=1;i<words.length;i++) 
		{
			while(!(words[i].startsWith(prefix))) 
			{ 
			    //System.out.println(prefix+prefix.length());    //012345         
				prefix=prefix.substring(0,prefix.length()-1);  //flowe
			   
				
			}
			System.out.println(prefix);
			
			
			
		}
		
	

	}

}
