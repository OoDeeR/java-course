package shorttasks.lists;

import java.util.ArrayList;
import java.util.List;

public class Iterate {

	public static void main(String[] args) {
		List<Number> listNum = new ArrayList<>();
		listNum.add(12);
		listNum.add(2.34);
		listNum.add(-7.1F);
		listNum.add((short)8891);

		for (Number number : listNum) {
			System.out.println(number);
		}
		
	}

}
