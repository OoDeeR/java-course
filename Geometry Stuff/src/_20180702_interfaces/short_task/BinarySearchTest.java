package _20180702_interfaces.short_task;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;


public class BinarySearchTest {

	public static void main(String[] args) {

		// int[] arr1 = { 1, 3, 2, 5, 4 };
		// int[] arr2 = arr1.clone();
		// Arrays.sort(arr2);
		//
		// for (int i = 0; i < arr1.length; i++) {
		//
		// System.out.println(arr1[i] + "\t" + Arrays.binarySearch(arr1, arr1[i]) + "\t"
		// + ArrayUtils.indexOf(arr1, arr1[i]) + "\t\t\t" + arr2[i] + "\t" +
		// Arrays.binarySearch(arr2, arr2[i]));
		// }

		int[] arrBig1 = new int[100000];
		Random r = new Random();
		long start = System.currentTimeMillis();
		for (int i = 0; i < arrBig1.length; i++) {
			int newElement = r.nextInt(arrBig1.length) + 1;
			if (!IntStream.of(arrBig1).anyMatch(x -> x == newElement))
				arrBig1[i] = newElement;
			else {
				i = i - 1;
			}
		}

		long end = System.currentTimeMillis();
		System.out.println("Filling an Array with " + arrBig1.length + " random elements without repeat takes "
				+ (end - start) + " ms.");

		int[] arrBig2 = arrBig1.clone();

		start = System.nanoTime();
		Arrays.sort(arrBig1);
		end = System.nanoTime();
		long sortingTime = end - start;
		// System.out.println(Arrays.toString(arrBig1));
		System.out.println("Sorting an Array of " + arrBig1.length + " elements takes " + sortingTime + " ns.");

		start = System.nanoTime();
		int binSearchResult = Arrays.binarySearch(arrBig1, 333);
		end = System.nanoTime();
		long binarySearchTime = end - start;
		System.out.println("Searching an Array of " + arrBig1.length + " elements with binSearch takes "
				+ binarySearchTime + " ns. Result: " + binSearchResult);

		start = System.nanoTime();
		int linSearchResult = getIndexOf(333, arrBig2);
		end = System.nanoTime();
		long linearSearchTime = end - start;
		System.out.println("Searching an Array of " + arrBig2.length + " elements with a linear search takes "
				+ linearSearchTime + " ns. Result: " + linSearchResult);

	}

	public static int getIndexOf(int toSearch, int[] intArray) {
		int i = 0;
		while (!(intArray[i] == toSearch)) {
			i++;
		}
		return i;
	}

}
