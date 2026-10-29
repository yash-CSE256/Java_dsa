package day3;

public class Callvalue {
	public static void main (String []args){
		int a= 10;
		System.out.println("this is"+a);   //10
		fun(a);                            //10  //20
		System.out.println("this is"+a);   //10
	}
	public static int fun(int b) {
		System.out.println("this is"+b);   //10
		b=20;
		System.out.println("this is"+b);   //20
		return b;
	}
	

}
