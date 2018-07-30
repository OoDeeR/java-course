package hensel.day4_datetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalDateTimeTest {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println(LocalTime.MIN);
		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.MIDNIGHT);
		System.out.println(LocalTime.NOON);
		
		System.out.println(time.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
		System.out.println(time.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
		//System.out.println(time.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG)));	//needs localization
		//System.out.println(time.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL)));

		System.out.println(time.format(DateTimeFormatter.ofPattern("HH:mm:ss.n")));

		LocalTime startJava = LocalTime.of(8, 0);
		System.out.println(startJava);
		LocalTime endFirstLecture = LocalTime.of(9, 30, 0);
		System.out.println(endFirstLecture);
		Duration dur1 = Duration.between(startJava,endFirstLecture);
		System.out.println(dur1.toMinutes());
		Duration durFirstBreak = Duration.ofMinutes(15);
		LocalTime endFirstBreak = endFirstLecture.plus(durFirstBreak);
		System.out.println(endFirstBreak);
		LocalTime endSecondLecture = LocalTime.parse("11:15:00");
		System.out.println(endSecondLecture);
		LocalTime endSecondBreak = endSecondLecture.plusMinutes(15);
		System.out.println(endSecondBreak);
		Duration durThirdLecture = Duration.ofHours(1).plusMinutes(30);
		LocalTime lunchBreak = endSecondBreak.plus(durThirdLecture);
		System.out.println(lunchBreak);

	}

}
