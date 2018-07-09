package shorttasks;

import java.util.function.Predicate;

public class Lambda {

	public static void main(String[] args) {
		Integer[] values = {-10, 1, 3, -4, 5, 7, 80, -34};
		Predicate<Integer> positive = x -> x%2 == 0 && x > 0;
		printIf(values, positive);
	}
	
	static void printIf (Integer[] values, Predicate<Integer> filter){
		for(Integer val : values) {
			if(filter.test(val)) {
				System.out.println(val + "");
			}
		}
		System.out.println();
	}

}
