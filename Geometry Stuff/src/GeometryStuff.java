
public class GeometryStuff {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			Rectangle rect = new Rectangle();
			System.out.println(i + ". Rechteck (" + rect.getHeight() + " X " + rect.getWidth() + ")");
		}
		
		Circle c = new Circle(5);
		
		System.out.println("nicht-statische Methode");
		changeRectDimsStat();
		
		System.out.println("statische Methode");
		Rectangle.changeDims(5000, 10000);
		Rectangle rect2 = new Rectangle();
		System.out.println("Rechteck (" + rect2.getHeight() + " X " + rect2.getWidth() + ")");
		
	}
	
	
	
	
	
	public static void changeRectDimsStat() {
		Rectangle rect = new Rectangle();
		rect.setHeight(5);
		rect.setWidth(10);
		System.out.println("Rechteck (" + rect.getHeight() + " X " + rect.getWidth() + ")");
	}
	

}
