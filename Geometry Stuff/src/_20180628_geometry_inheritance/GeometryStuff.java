package _20180628_geometry_inheritance;

public class GeometryStuff {

	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle(3,4);
		rect1.setCoordinates(0,0);
		System.out.println(rect1);
		rect1.moveObject(12,-7);
		System.out.println(rect1);
		
		Circle circ1 = new Circle(4);
		circ1.setCoordinates(0,0);
		System.out.println(circ1);
		circ1.moveObject(33,1);
		System.out.println(circ1);

	}

}
