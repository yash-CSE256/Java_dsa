package day27;

public class Palindrome {

	public static void main(String[] args) 
	{
		String s="iti";
		s=s.replaceAll(" ", "");
		System.out.println(s);
		char []name=s.toCharArray();
		int i=0,j=name.length-1;
		while(i<=j) 
		{
			if(name[i]!=name[j]) 
			{
				System.out.println("not palindrome");
				return;
			
			}
			else {
				i++;j--;
			}
		}
		System.out.println("its palindrome");

	}

}
