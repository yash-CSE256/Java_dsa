package day39;
import java.io.*;
import java.nio.file.*;
public class Demofile1 
{

	public static void main(String[] args)
	{
		String filename="folder/demo2.text";
		File fl =new File(filename);
		if(!fl.exists()) 
		{
			fl.getParentFile().mkdirs();
		}
		
		
		try(
				FileWriter fw = new FileWriter(filename,true);// true preserve and wite 
				BufferedWriter bw=new BufferedWriter(fw);//try with resourses 
			)
		{
			bw.write("hello");
			bw.append("yash");
			bw.newLine();
			bw.write("  yash gangurde ");
			bw.newLine();bw.newLine();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
				
		
		//bw.close(); //no need to manualy close if we use try with resourses
		

	}

}
