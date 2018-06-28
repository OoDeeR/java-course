package _20180627_geometry_classes;

public class GeometryStuff {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			Rectangle rect = new Rectangle();
			System.out.print("\n" + i + ". ");
			System.out.print(rect);
		}
		
		Circle c = new Circle(5);
		System.out.println();
		Circle.print(c);
				
		System.out.println("\nstatische Methode\n");
		changeRectDimsStat();
		
		System.out.println("\nnicht-statische Methode\n");
		Rectangle rect1 = new Rectangle();
		rect1.changeDims(25,50);
		System.out.println(rect1);

		
	}
	
	public static void changeRectDimsStat() {
		Rectangle rect = new Rectangle();
		rect.setHeight(5);
		rect.setWidth(10);
		Rectangle.print(rect.getHeight(),rect.getWidth());
		Rectangle.print(rect);
		System.out.println(rect);
	}
	

}
