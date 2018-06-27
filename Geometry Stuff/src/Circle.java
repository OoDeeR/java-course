
public class Circle {
	
	private int radius;
	
	public Circle(int x) {
		this.radius = x;
		System.out.println("Kreis. R = " + this.radius);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
