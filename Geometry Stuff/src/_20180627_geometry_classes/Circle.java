package _20180627_geometry_classes;

public class Circle {
	
	private int radius;
	
	public Circle(int x) {
		this.radius = x;
		
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public static void print(Circle c) {
		System.out.println("Kreis. R = " + c.radius);
	}

}
