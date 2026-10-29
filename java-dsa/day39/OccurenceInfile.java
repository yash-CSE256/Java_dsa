package day39;
import java.io.*;
public class OccurenceInfile {

	public static void main(String[] args) throws IOException 
	{
		String filename="folder/demofile2.text";
		File fl=new File(filename);
		fl.getParentFile().mkdirs();
		
		FileWriter fw=new FileWriter(filename);
		BufferedWriter bw =new BufferedWriter(fw);
		
		bw.write("my name is yash and my name is yash yash now i yash");
		bw.newLine();
		bw.write("f dfjhb yash uand yash  now oits yah ");
		
		bw.close();
		
		wordsearch(filename);

	}

	private static void wordsearch(String filename) throws IOException 
	{
		FileReader fr=new FileReader(filename);
		BufferedReader br=new BufferedReader(fr);
		
		String search="yash";
		String data="";
		int linecount=0;
	
		while((data=br.readLine())!=null) 
		{
			int count=0;
			linecount++;
			int sindex=0;
			int index;
			while((index=data.indexOf(search,sindex))!=-1) 
			{
				count++;
				sindex=index+search.length();
			}
			System.out.println("line "+linecount+" has "+count +" occurence");
		}
		
		
	}

}
