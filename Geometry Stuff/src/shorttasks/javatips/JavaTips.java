package shorttasks.javatips;

import java.util.Arrays;

public class JavaTips {
	String text;
	String[] themen;
	
	public JavaTips(String text, String[] themen) {
		this.text = text;
		this.themen = themen;
	}
	
	public JavaTips(String text) {
		this.text = text;
		this.themen = null;
	}
	
	public JavaTips(String[] themen) {
		this.text = null;
		this.themen = themen;
	}
	
	@Override
	public String toString() {
		return "Text: " + text + "\nThemen: " + Arrays.toString(themen).replace("[", "").replace("]", "");
	}
}
