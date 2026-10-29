package day2;

public class fun {
	public static void main(String[] args) {
		System.out.println("i am in main");
		brazil();
		System.out.println("i am back in main");
	}
static void brazil() {
	System.out.println("iam in brazil");
	france();
	System.out.println("i am back in brazil");
}
static void france() {
	System.out.println("i am in france");
}
}
