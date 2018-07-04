package _20180702_interfaces.short_task;

public class Auto implements Comparable<Auto> {

	String manufacturer;
	String model;
	int pYear;

	public Auto(String a, String b, int c) {
		this.manufacturer = a;
		this.model = b;
		this.pYear = c;
	}

	@Override
	public int compareTo(Auto o) {
		int result = manufacturer.compareTo(o.manufacturer);

		if (result == 0) {
			result = model.compareTo(o.model);
		}
		
		if (result == 0) {
			result = (pYear - o.pYear);
		}

		return result;
	}
	
	@Override
	public String toString() {
		return "Herst.: " + this.manufacturer + ", Modell: " + this.model + ", Baujahr: " + this.pYear;
	}

}
