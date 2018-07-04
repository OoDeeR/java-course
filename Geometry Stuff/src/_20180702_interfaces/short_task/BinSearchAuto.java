package _20180702_interfaces.short_task;

import java.util.Arrays;
import java.util.Comparator;

import org.apache.commons.lang3.ArrayUtils;

public class BinSearchAuto {

	public static void main(String[] args) {
		Auto[] autoArray = new Auto[6];
		String[] manufacturers = {"BMW","Opel","Ford","VW","VW","VW"};
		String[] models = {"Z3","Astra","Focus","Golf","Golf","Passat"};
		int[] manYear = {2009,1991,2005,2000,2005,1995};
		for (int i = 0; i < autoArray.length; i++) {
			autoArray[i] = new Auto(manufacturers[i], models[i], manYear[i]);
		}
		Auto autoToSearch = new Auto("BMW","Z3",2009);
		
		Arrays.sort(autoArray);
		int binSearchResult = Arrays.binarySearch(autoArray, autoToSearch);
		
		System.out.println(binSearchResult);
		for (int i = 0; i < autoArray.length; i++) {
			System.out.println(autoArray[i]);
		}
		
		System.out.println("\n---------------reverse sort---------------\n");
		
		Comparator<Auto> cmp = new ComparatorAutoReverse();
		Arrays.sort(autoArray,cmp);
		
		binSearchResult = Arrays.binarySearch(autoArray, autoToSearch, cmp);
		
		System.out.println(binSearchResult);
		for (int i = 0; i < autoArray.length; i++) {
			System.out.println(autoArray[i]);
		}
		

	}

}
