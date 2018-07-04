package _20180702_interfaces.short_task;

import java.util.Comparator;

public class ComparatorAutoReverse implements Comparator<Auto>{

	@Override
	public int compare(Auto a1, Auto a2) {
		return a2.compareTo(a1);
	}

}
