package hensel.day1_exceptions;

public class ExceptionTest2 {

	public static void main(String[] args) {
		try {
			Car a1 = new Car("Tr", 55);
			System.out.println("Car2: " + a1);
		} catch (Exception e) {
			System.out.println("Ungültiges Argument");
		}
		String name = null;
		try {
			Car a2 = new Car(name, -42);
			System.out.println("Car2: " + a2);
		} catch (Exception e) {
			System.out.println("Ungültiges Argument");
		}
	}

}

class Car {
	private String name;
	private int ps;
	
	Car(){
		
	}
	
	Car(String name, int ps){
		this.setName(name);
		this.setPs(ps);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name ==  null || name.length() < 3) {
			throw new IllegalArgumentException("Name muss mindestens 3 Zeichen enthalten: " + name);	//Exception eher in Klasse als in main
		}
		this.name = name;
	}

	public int getPs() {
		return ps;
	}

	public void setPs(int ps) {
		if (ps < 50) {
			throw new IllegalArgumentException("PS darf nicht <50 sein: " + ps);	//Exception eher in Klasse als in main
		}
		this.ps = ps;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + name + "; PS: " + ps;
	}
}