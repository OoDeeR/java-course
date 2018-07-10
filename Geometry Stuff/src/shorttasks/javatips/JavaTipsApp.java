package shorttasks.javatips;

import java.util.Arrays;
import java.util.function.Predicate;

public class JavaTipsApp {

	public static void main(String[] args) {
		String[] texte = new String[] {
				"Mit dem Schlüsselwort 'implements' kann eine Klasse ein Interface realisieren.",
				"Eine Klasse kann nur eine andere Klasse erweitern.",
				"Statische Methoden werden mit dem Klassennamen aufgerufen.",
				"Alle Attribute in einem neuen Objekt werden im Konstruktor initialisiert.",
				"Beim Überschreiben darf die Sichtbarkeit nicht verschärft werden.",
				"Alle Elemente in einem Interface sind immer 'public'."
		};
		
		String[][] themen = new String[][] {
			{"Vererbung", "Klassen", "Interfaces"},
			{"Vererbung", "Klassen"},
			{"Klassen", "Methoden", "static"},
			{"Klassen", "Konstruktoren", "Attribute"},
			{"Klassen", "Methoden", "Überschreiben"},
			{"Interfaces", "Sichtbarkeiten"}
		};
		JavaTips[] arr = new JavaTips[texte.length];
		for (int i = 0; i < texte.length; i++) {
			arr[i] = new JavaTips(texte[i],themen[i]);
		}
		
	
		
		Predicate<JavaTips> containsAll = jT -> jT.text.contains("");			//A3
		Predicate<JavaTips> containsText = jT -> jT.text.contains("Klasse");	//A4
		Predicate<JavaTips> hasTwoThemes = jT -> jT.themen.length == 2;			//A5
		Predicate<JavaTips> containsTheme = jT -> Arrays.asList(jT.themen).contains("Klassen");	//A6
		Predicate<JavaTips> containsThemeExcludesOther = jT -> Arrays.asList(jT.themen).contains("Klassen") && !Arrays.asList(jT.themen).contains("Vererbung");	//A7
		
		System.out.println("---A3---");
		printIf(arr, containsAll);
		System.out.println("---A4---");
		printIf(arr, containsText);
		System.out.println("---A5---");
		printIf(arr, hasTwoThemes);
		System.out.println("---A6---");
		printIf(arr, containsTheme);
		System.out.println("---A7---");
		printIf(arr, containsThemeExcludesOther);
		
	}
		
	static void printIf (JavaTips[] arr, Predicate<JavaTips> filter){
		int i = 0;
		for(JavaTips val : arr) {
			if(filter.test(val)) {
				System.out.println("Tipp #" + (i++ +1) + ":");
				System.out.println(val + "\n");
			}
		}
	}
}
