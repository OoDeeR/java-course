package _20180702_interfaces.geometry;

public class Rectangle extends GeoObject{
	
	private int height;
	private int width;
		
	public Rectangle() {
		
	}
	
	public Rectangle(int h, int w) {
		this.height = h;
		this.width = w;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public static void changeDims(Rectangle r, int h, int w) {
		r.height = h;
		r.width = w;
	}
	
	public void changeDims(int h, int w) {
		height = h;
		width = w;
	}
	
	public double getArea() {
		int area = this.getHeight() * this.getWidth();
		return area;
	}
	
	public static void print(int x, int y) {
		System.out.println("Rechteck (" + x + " X " + y + ")");
	}
	
	public static void print(Rectangle r) {
		System.out.println("Rechteck (" + r.getHeight() + " X " + r.getWidth() + ")");
	}
	
	public String toString() {
		return "Rechteck\t(" + this.getHeight() + " X " + this.getWidth() + ") \tCoordinates: " + getxCoordinate() + "," + getyCoordinate() + "\tFlaeche: " + getArea();
	}
	

}
