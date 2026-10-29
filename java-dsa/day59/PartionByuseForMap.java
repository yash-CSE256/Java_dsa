package day59;
import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Map;
public class PartionByuseForMap {

	public static void main(String[] args) throws IOException {
		//Player p1= new Player(1, "Virat Kohli", "India", 85);
		//Player p2 =new Player(2, "Rohit Sharma", "India", 72);
		//Player p3=new Player(3, "MS Dhoni", "India", 56);
		//Player p4=new Player(4, "Babar Azam", "Pakistan", 20);
		//Player p5=new Player(5, "Joe Root", "England", 65);
		//Player p6=new Player(6, "Steve Smith", "Australia", 78);
		//Player p7= new Player(7, "Kane Williamson", "New Zealand", 45);
		//Player p8=new Player(8, "Ben Stokes", "England", 32);
		//Player p9=  new Player(9, "David Warner", "Australia", 60);
		//Player p10= new Player(10, "Jasprit Bumrah", "India", 12);
		
		
		//List<Player>li=Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10);
		
		//Map<Boolean,List<Player>>m = li.stream().collect(Collectors.partitioningBy(n->n.country.equalsIgnoreCase("india")));
		//System.out.print(m.get(true));
		File source =new File("C:\\Users\\thega\\Downloads\\player.json");
		File dest=new File("folder\\player.json"); 
		
		if(!dest.getParentFile().exists()|| !dest.exists()) 
		{
			dest.getParentFile().mkdirs();
			
			Files.copy(source.toPath(), dest.toPath());
		}
		
		ObjectMapper om=new ObjectMapper();
		List<Player>li=null;
		li=om.readValue(
				dest,
				new TypeReference <List<Player>>  () {});
		System.out.println(li);
		
		Map<Boolean,List<Player>>m=new HashMap();
		
		m=li.stream().collect(Collectors.partitioningBy(p->p.getCountry().equalsIgnoreCase("india")));
		System.out.println(m);
		

	}

}
