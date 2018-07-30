package hensel.day4_datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest {

	public static void main(String[] args) {


		Period p = Period.ofYears(1).withMonths(5).withDays(13);
		long gebDate = LocalDate.of(1982, 12, 25).toEpochDay();
		long now = LocalDate.now().toEpochDay();
		long myAge = ChronoUnit.DAYS.between(gebDate, now) * 86400 ;
		System.out.println(myAge);

	}

}
