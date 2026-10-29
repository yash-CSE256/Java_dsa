package day40;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SerializableDriverApp
{

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		SstudentClass s1=new SstudentClass(3,"mahesh",64);
		SstudentClass s2=new SstudentClass(4,"ash",87);
		SstudentClass s3=new SstudentClass(5,"sam",45);
		SstudentClass s4=new SstudentClass(6,"yash",84);
		
		File f=new File("folder/objectfile.text");
		
		if(!f.getParentFile().exists()) 
		{
			f.getParentFile().mkdirs();
		}
		
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(new ArrayList<SstudentClass>(Arrays.asList(s1,s2,s3,s4)));//write object in file
		
		oos.close();
		fos.close();
		
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		List<SstudentClass>all=(List<SstudentClass>) ois.readObject();
		
		ois.close();
		fis.close();
		
		System.out.print(all);
		
	}

}
