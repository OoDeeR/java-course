package project;

public class Game extends System{

	boolean multiplayer;
	String genre;
	
	public Game(String name) {
		this.name = name;
	}
	
	public Game(String name, String genre) {
		this.name = name;
		this.genre = genre;
	}
	
	@Override
	public String toString() {
		return this.name + "\t\t\t" + super.name + "\t" + this.genre + "\t" +this.release;
	}
}
