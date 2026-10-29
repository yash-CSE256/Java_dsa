package day43;
import java.io.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class PlayerJsonDriverApp 
{

	public static void main(String[] args) throws IOException 
	{
       // File source = new File("C:\\Users\\thega\\Downloads\\player.json");//"C:\Users\thega\Downloads\foods.json"
		//File fl = new File("folder/p.json"); 
		
		
			//fl.getParentFile().mkdirs();
			//System.out.println("folder is created");
		
		//Files.copy(source.toPath(),fl.toPath(),StandardCopyOption.REPLACE_EXISTING);//this throw exeption
		
	  
		ObjectMapper om=new ObjectMapper();

		List<PlayerMaatchData> player = null;
		player=    om.readValue(new File("folder/p.json"),
				                                new TypeReference<List<PlayerMaatchData>>
		                                        () {} );
		
		System.out.println(player);
	
	            
		

	}

}
