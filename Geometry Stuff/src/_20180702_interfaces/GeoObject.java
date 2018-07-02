package _20180702_interfaces;

public abstract class GeoObject {

	private int xCoordinate;
	private int yCoordinate;

	public void moveObject(int x, int y) {
		this.setxCoordinate(x);
		this.setyCoordinate(y);
	}

	public int getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	
	public int getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	
	public void setCoordinates(int x, int y) {
		this.xCoordinate = x;
		this.yCoordinate = y;
	}
	
}
