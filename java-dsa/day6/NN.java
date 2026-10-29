package day6;
import java.util.Scanner;
public class NN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String item;
        String size;
        String flavour;

        System.out.println("Select your choice");
        System.out.println("1. Burger");
        System.out.println("2. Pizza");
        System.out.println("3. Fries");

        int choice = sc.nextInt();

        switch(choice)
        {
        case 1:
            item = "Burger";
            break;

        case 2:
            item = "Pizza";
            break;

        case 3:
            item = "Fries";
            break;

        default:
            System.out.println("Invalid Choice");
            return;
        }

        // Size
        System.out.println("\nSelect Size");
        System.out.println("1. Large");
        System.out.println("2. Medium");
        System.out.println("3. Small");

        choice = sc.nextInt();

        switch(choice)
        {
        case 1:
            size = "Large";
            break;

        case 2:
            size = "Medium";
            break;

        case 3:
            size = "Small";
            break;

        default:
            System.out.println("Invalid Size");
            return;
        }

        // Flavour (Same for Burger, Pizza and Fries)
        System.out.println("\nSelect Flavour");
        System.out.println("1. Peri Peri");
        System.out.println("2. Tangy Tomato");
        System.out.println("3. Hot Chilly");

        choice = sc.nextInt();

        switch(choice)
        {
        case 1:
            flavour = "Peri Peri";
            break;

        case 2:
            flavour = "Tangy Tomato";
            break;

        case 3:
            flavour = "Hot Chilly";
            break;

        default:
            System.out.println("Invalid Flavour");
            return;
        }

        System.out.println("\n========================");
        System.out.println("Your Order");
        System.out.println(size + " " + flavour + " " + item);
        System.out.println("========================");

        sc.close();
    }
}
