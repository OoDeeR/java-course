package _20180628_geometry_inheritance;
import java.util.Random;

public class Rectangle extends GeoObject{
	
	private int height;
	private int width;
		
	public Rectangle() {
		Random r = new Random();
		height = r.nextInt(20)+1;
		width = r.nextInt(20)+1;
	}
	
	public Rectangle(int h, int w) {
		height = h;
		width = w;
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
	
	public static void print(int x, int y) {
		System.out.println("Rechteck (" + x + " X " + y + ")");
	}
	
	public static void print(Rectangle r) {
		System.out.println("Rechteck (" + r.getHeight() + " X " + r.getWidth() + ")");
	}
	
	public String toString() {
		return "Rechteck (" + this.getHeight() + " X " + this.getWidth() + "), Coordinates: " + getxCoordinate() + "," + getyCoordinate();
	}
	

}
