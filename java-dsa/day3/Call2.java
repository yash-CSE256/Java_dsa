package day3;
import java.util.Scanner;
public class Call2 {
	public static void main(String[]args) {
		area();
	}
	static void area() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius");
		int r=sc.nextInt();
		double area=r*r*3.14;
		System.out.println("area is "+ area);
		sc.close();
	}

}
