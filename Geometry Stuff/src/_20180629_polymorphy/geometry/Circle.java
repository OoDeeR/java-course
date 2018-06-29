package _20180629_polymorphy.geometry;

public class Circle extends GeoObject{
	
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
	
	public double getArea() {
		double area = this.getRadius() * this.getRadius() * Math.PI;
		return area;
	}
	
	public static void print(Circle c) {
		System.out.println("Kreis. R = " + c.radius);
	}
	
	public String toString() {
		return "Kreis (Radius: " + this.getRadius() + "), Coordinates: " + getxCoordinate() + "," + getyCoordinate();
	}

}
