package day6;
import java.util.Scanner;

public class Macd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String item;
        String size;
        String flavour;
		System.out.println("select your choice");
		System.out.println("1:burger");
		System.out.println("2:pizza");
		System.out.println("3:fries");
		int choice = sc.nextInt();
		switch(choice) 
		{
		case 1:item="burger";System.out.println("1:burger");
		break;
		case 2:item="pizza";System.out.println("2:pizaa");
		break;
		case 3:item="fries";System.out.println("3:fries");
		 default:
	            System.out.println("Invalid Size");
	            return;
		}
		System.out.println("** select size **");
		System.out.println("1:large");
		System.out.println("2:medium");
		System.out.println("3:small");
		choice =sc.nextInt();
		switch(choice) 
		{
		case 1:size="large";System.out.println("large");
		break;
		case 2:size ="medium";System.out.println("medium");
		break;
		case 3:size="small";System.out.println("small");
		 default:
	            System.out.println("Invalid Size");
	            return;
		
		}
		
		System.out.println("select flavour");
		System.out.println("1:peri peri");
		System.out.println("2:tangy tomato");
		System.out.println("3:hot chilly");
		choice=sc.nextInt();
		switch(choice) 
		{
		case 1:flavour ="peri peri";System.out.println("peri peri");
		break;
		case 2:flavour ="tangy tomato";System.out.println("tangy tomato");
		break;
		case 3:flavour ="hot chilly";System.out.println("hot chilly");
		 default:
	            System.out.println("Invalid Size");
	            return;
		}
		
		System.out.println("your order"+" "+flavour+" "+size+" "+item);
		}

}
