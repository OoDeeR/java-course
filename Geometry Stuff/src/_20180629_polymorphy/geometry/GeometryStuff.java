package _20180629_polymorphy.geometry;

import java.util.Random;

public class GeometryStuff {

	public static void main(String[] args) {
		Random rand = new Random();
		GeoObject[] object = new GeoObject[100];
		
		for (int i = 0; i < object.length; i++) {
			boolean coinflip = rand.nextBoolean();
			int h = rand.nextInt(20)+1;
			int w = rand.nextInt(20)+1;
			int r = rand.nextInt(10)+1;
			if (coinflip) {
				object[i] = new Rectangle(h, w);
			}
			else {
				object[i] = new Circle(r);
			}
		}
		listObjects(object);
	}
	
	public static void listObjects(GeoObject[] g) {
		for (int i = 0; i < g.length; i++) {
			System.out.println(g[i]);
		}
	}
}
