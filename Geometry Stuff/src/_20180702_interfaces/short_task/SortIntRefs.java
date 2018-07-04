package _20180702_interfaces.short_task;

import java.util.Arrays;
import java.util.Collections;

public class SortIntRefs {

	public static void main(String[] args) {
		
		Integer[] intArray = { 2, 5, -3, 7, 2 };
		System.out.println(Arrays.toString(intArray));
		Arrays.sort(intArray);
		System.out.println(Arrays.toString(intArray));
		Arrays.sort(intArray, Collections.reverseOrder());
		System.out.println(Arrays.toString(intArray));

	}

}
