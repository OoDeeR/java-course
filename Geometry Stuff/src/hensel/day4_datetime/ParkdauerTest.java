package hensel.day4_datetime;

import java.text.NumberFormat;
import java.time.Duration;
import java.time.LocalTime;

public class ParkdauerTest {

	public static void main(String[] args) {
		LocalTime parkStart = LocalTime.of(7, 56);
		LocalTime parkEnd1 = LocalTime.of(11, 20);
		LocalTime parkEnd2 = LocalTime.of(13, 06);
		LocalTime parkEnd3 = LocalTime.of(15, 13);

//		        Variante 1: Parkgebühr immer
//		        Variante 2: Parkgebühr zwischen 9:00 und 20 Uhr
//		        Variante 1: Immer 1 Euro pro Stunde
//		        Variante 2: In den ersten drei Stunden 1 Euro pro Stunde, danach 1,50 Euro pro Stunde
//		        Jede angefangene Minute zählt
		
		calculateParkingCost1(parkStart,parkEnd1);
		calculateParkingCost1(parkStart,parkEnd2);
		calculateParkingCost1(parkStart,parkEnd3);
		
	
	}
	
	static void calculateParkingCost1(LocalTime s, LocalTime e) {
		Duration parkTime = Duration.between(s,e);
				
		double parkingCost1 = Math.round(parkTime.toMinutes() * 100 / 60) / 100d;
		System.out.println(NumberFormat.getCurrencyInstance().format(parkingCost1));
	}

}
