package day56;

public class AnimalDriverApp {

	public static void main(String[] args) {
		Animal a1=new Horse();
		a1.eat();
		a1=()->
		{
			System.out.println(" i am earting now");
		};
		a1.eat();
	

	}

}
