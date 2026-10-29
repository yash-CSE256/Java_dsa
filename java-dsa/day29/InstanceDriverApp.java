package day29;
import java.io.*;

public class InstanceDriverApp {

	public static void main(String[] args) 
	{
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = null;
		try 
		{
			bw = new BufferedWriter(new FileWriter("output.txt"));
		} 
		catch (IOException ex)
		{
			ex.printStackTrace();
			
		}
		//this create file and write in that file
		
		try {
			bw.write("enter value of nourbf.");
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		System.out.println("enter value of no.no");
		int no = 0;
		try {
			no = Integer.parseInt(bf.readLine());
		}
		catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		InstanceScope sc1=new InstanceScope();
		sc1.accept();
		sc1.display();
		InstanceScope.batchdisplay();
		InstanceScope sc2=new InstanceScope();
		sc1.SetRno(no);
		sc1.getRno();
		System.out.println(sc1.getRno());
		InstanceScope.batchdisplay(); //static method
	// can access if batchname is not private 	String batchName = InstanceScope.batchName;
	}

}