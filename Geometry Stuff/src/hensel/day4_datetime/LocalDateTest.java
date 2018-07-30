package hensel.day4_datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class LocalDateTest {

	public static void main(String[] args) {
		// Java 1.0
		Date d = new Date();
		System.out.println("d = " + d);
		Date geburtsDatum = new Date(1966, 11, 14);// Offset im Jahr von 1900
		geburtsDatum = new Date(66, 10, 13); // Monat ist null-basiert
		System.out.println("geburtsDatum = " + geburtsDatum);
		
		// Java 1.1
		Calendar c = new GregorianCalendar();
		c = new GregorianCalendar(1966, 11, 13);
		System.out.println("c = " + c);
		System.out.println("c = " + c.getTime());
		
//		LocalDate date = new LocaleDate(); // Compiler-Fehler
		LocalDate date = LocalDate.now(); // heute
		System.out.println("date = " + date);
		LocalDate gebDat = LocalDate.of(1966, 8, 13);
		System.out.println("gebDat = " + gebDat);
		String dateStr = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
		System.out.println(dateStr);
		dateStr = date.format(DateTimeFormatter.ofPattern("d.M.y"));
		System.out.println(dateStr);


	}

}