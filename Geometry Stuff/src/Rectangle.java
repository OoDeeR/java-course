import java.util.Random;

public class Rectangle {
	
	private static int height;
	private static int width;
	
	public Rectangle() {
		Random r = new Random();
		height = r.nextInt(20)+1;
		width = r.nextInt(20)+1;
	}
	
	public Rectangle(int h, int w) {
		height = this.getHeight();
		width = this.getWidth();
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
	
	public static void changeDims(int h, int w) {
		height = h;
		width = w;
	}

}
