package day3;
import java.util.Scanner;
public class Call3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter principle");
		int p = sc.nextInt();
		System.out.println("enter rate");
		double r = sc.nextInt();
		System.out.println("enter years");
		int n = sc.nextInt();
		double s = si(p,r,n);
		System.out.println("simple intrest is  "+s);
		

	}
	public static int si(int p,double r,int n) {
		int s=(int)(p*r*n)/100;
		return s;
	}
	

}
