package _20180629_polymorphy.geometry;

public class GeometryStuff {

	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle(3,4);
		rect1.setCoordinates(0,0);
		System.out.println(rect1);
		rect1.moveObject(12,-7);
		System.out.println(rect1);
		System.out.println(rect1.getArea());
		
		Circle circ1 = new Circle(4);
		circ1.setCoordinates(0,0);
		System.out.println(circ1);
		circ1.moveObject(33,1);
		System.out.println(circ1);
		System.out.println(circ1.getArea());


	}

}
