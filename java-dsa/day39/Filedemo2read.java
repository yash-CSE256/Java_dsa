package day39;

import java.io.*;

public class Filedemo2read 
{

	public static void main(String[] args) throws IOException 
	{
		FileReader fr=new FileReader("folder/demo2.text");
		BufferedReader br=new BufferedReader(fr);
		
		int data;
		while((data=fr.read())!=-1)
		{
		System.out.print((char)data);
		}
		br.close();//this closes both 
		
		


	}

}
