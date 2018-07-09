package shorttasks;

public class Tier {
	String name;
	boolean gesund;


	public boolean isGesund() {
		return gesund;
	}

	public Tier(String name, boolean gesund) {
		this.name = name;
		this.gesund = gesund;
	}

	public Tier(String name) {
		this.name = name;
		this.gesund = true;
	}

	public String toString() {
		return name + " ist " + gesund;
	}
}
