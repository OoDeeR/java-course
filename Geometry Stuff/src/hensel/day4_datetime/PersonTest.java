package hensel.day4_datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PersonTest {

	public static void main(String[] args) {
		try {
			Person p1 = new Person("Peter", LocalDate.of(1970, 12, 12));
			System.out.println("Hat " + p1.getName() + " heute Geburtstag? " + p1.hatGeburtstag() + " ...ist " + p1.getAge() + " Jahre alt.");
			Person p2 = new Person("Marion", LocalDate.of(1976, 7, 19));
			System.out.println("Hat " + p2.getName() + " heute Geburtstag? " + p2.hatGeburtstag() + " ...ist " + p2.getAge() + " Jahre alt.");
			Person p3 = new Person("Robbie", LocalDate.of(2018, 7, 19));
			System.out.println("Hat " + p3.getName() + " heute Geburtstag? " + p3.hatGeburtstag() + " ...ist " + p3.getAge() + " Jahre alt.");
			Person p4 = new Person("Robbo", LocalDate.of(2018, 7, 18));
			System.out.println("Hat " + p4.getName() + " heute Geburtstag? " + p4.hatGeburtstag() + " ...ist " + p4.getAge() + " Jahre alt.");
		} catch (IllegalArgumentException e) {
			System.out.println("Namen müssen aus mindestens 3 Buchstaben bestehen!" + e);
		}
	}
}

class Person {
	private String name;
	private LocalDate geburtsdatum;
	Person(String name, LocalDate geburtsdatum) {
		this.setName(name);
		this.setGeburtsdatum(geburtsdatum);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if ( name == null || name.length() < 3)
			throw new IllegalArgumentException("zu kurz: " + name);
		else this.name = name;
	}

	public LocalDate getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(LocalDate geburtsdatum) {
		if ( geburtsdatum == null || geburtsdatum.toEpochDay() > LocalDate.now().toEpochDay())	//isAfter / isBefore natürlich kürzer
			throw new IllegalArgumentException("in der Zukunft: " + geburtsdatum);
		else this.geburtsdatum = geburtsdatum;
	}

	public boolean hatGeburtstag() {
		if (getGeburtsdatum().format(DateTimeFormatter.ofPattern("d.M")).equals(LocalDate.now().format(DateTimeFormatter.ofPattern("d.M"))) && getGeburtsdatum().getYear() <= LocalDate.now().getYear()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getAge() {
		if (this.getGeburtsdatum().getMonthValue() <= LocalDate.now().getMonthValue() && this.getGeburtsdatum().getDayOfMonth() <= LocalDate.now().getDayOfMonth()) {
			return LocalDate.now().getYear() - this.getGeburtsdatum().getYear();
		}
		else {
			return LocalDate.now().getYear() - this.getGeburtsdatum().getYear() - 1;
		}
	}
}
