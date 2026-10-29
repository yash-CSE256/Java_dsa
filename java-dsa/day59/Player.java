package day59;

public class Player {
	
	private int no;
	private String name;
	private String country;
	private int run;
	
	public Player() {}
	
	public Player(int no, String name, String country, int run) {
		this.no = no;
		this.name = name;
		this.country = country;
		this.run = run;
	}
	public final int getNo() {
		return this.no;
	}
	public final void setNo(int no) {
		this.no = no;
	}
	public final String getName() {
		return this.name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getCountry() {
		return this.country;
	}
	public final void setCountry(String country) {
		this.country = country;
	}
	public final int getRun() {
		return this.run;
	}
	public final void setRun(int run) {
		this.run = run;
	}
	@Override
	public String toString() {
		return "Player [No=" + no + ", name=" + name + ", country=" + country + ", run=" + run + "]";
	}
	
	

}
