package day6;
import java.util.Scanner;

public class NestedSwitch {

	public static void main(String[] args) {
		System.out.println(":enter your choice");		
		System.out.println("1:burger");
		System.out.println("2:pizza");
		System.out.println("3:fries");

		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) 
		{
		case 1:System.out.println("you selected burger");
		System.out.println("select burger size options");
		System.out.println("1:Larg");
		System.out.println("2:medium");
		System.out.println("3:small");
		choice = sc.nextInt();
		switch(choice) 
		{
		case 1:System.out.println("1:large burger");
		break;
		case 2:System.out.println("2:medium burger");
		break;
		case 3:System.out.println("3:samallburger");
		break;
		}
		case 2:System.out.println("you selected pizza");
		System.out.println(":select pizza size");
		System.out.println("1:large");
		System.out.println("2:medium");
		System.out.println("3:small");
		choice =sc.nextInt();
		switch(choice) 
		{
		case 1:System.out.println("1:large pizza");
		break;
		case 2:System.out.println("2:medium pizza");
		break;
		case 3:System.out.println("3:small pizza");
		break;
		
		}
		case 3:System.out.println("you selected fries");
		System.out.println("select fries size");
		System.out.println("1:large");
		System.out.println("2:medium");
		System.out.println("3:small");
		choice = sc.nextInt();
		switch(choice) 
		{
		case 1:System.out.println("1:large fries");
		break;
		case 2:System.out.println("2:medium fries");
		break;
		case 3:System.out.println("3:large fries");
		System.out.println("select flavour of fries");
		System.out.println("1:peri peri");
		System.out.println("2:tangy tomato ");
		System.out.println("3:hot chilly ");
		choice =sc.nextInt();
		switch (choice) 
		{
		case 1:System.out.println("1:peri peri fries");
		break;
		case 2:System.out.println("2:tangy tomato fries ");
		break;
		case 3:System.out.println("3:hot chilly fries");
		
		}
		}
		
		}
		
		
		
	}
	

}
