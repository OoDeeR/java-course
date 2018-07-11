package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ArrayListApp {

	public static void main(String[] args) {
		
		List<Integer> a1List = new ArrayList<>();
		List<String> a2List = new ArrayList<>();
		Random r = new Random();
		
		//doA1(a1List, r);
		//doA2(a2List);
		//doA3(a2List);
		//doA4(a1List);
		//doA5(a1List);
		//doA6(a1List,r);
		//doA7(a1List,r);
		doA8(a1List,r);



		
	}
	
	static void doA1(List<Integer> a1List, Random r) {
		for (int i = 0; i < 20; i++) {
			int toAdd = r.nextInt(201)-100;
			a1List.add(toAdd);
			System.out.println(toAdd);
		}
	}
	
	static void doA2(List<String> a2List) {
		a2List = Arrays.asList("mo","di","mi","do","fr");
		for (String day : a2List) {
			System.out.println(day);
		}
	}
	
	static void doA3(List<String> a3List) {
		a3List = Arrays.asList("mo","di","mi","do","fr");
		Iterator<String> it = a3List.iterator();
		int count = 0;
		while (it.hasNext()) {
			System.out.println(a3List.get(count));
			it.next();
			count++;
		}
	}
	
	static void doA4(List<Integer> a4List) {
		a4List = Arrays.asList(10,20,30,40,50,60,70,80);
		for (int i = 0; i < a4List.size(); i++) {
			if(i%2 != 0) {
				System.out.println(a4List.get(i));
			}
		}
	}
	
	static void doA5(List<Integer> a5List) {
		a5List = Arrays.asList(10,20,30,40,50,60,70,80);
		for (int i = a5List.size()-1; i >= 0; i--) {
			System.out.println(a5List.get(i));
		}
	}
	
	static void doA6(List<Integer> a6List, Random r) {
		for (int i = 0; i < 20; i++) {
			int toAdd = r.nextInt(201)-100;
			a6List.add(toAdd);
		}
		System.out.println(a6List);
		Collections.sort(a6List);
		System.out.println(a6List);
	}
	
	static void doA7(List<Integer> a7List, Random r) {
		for (int i = 0; i < 10; i++) {
			int toAdd = r.nextInt(51);
			a7List.add(toAdd);
		}
		Integer i = new Integer(12);
		int index = a7List.indexOf(i);
		System.out.println(a7List);
		System.out.println(index);
	}
	
	static void doA8(List<Integer> a8List, Random r) {
		for (int i = 0; i < 10; i++) {
			int toAdd = r.nextInt(51);
			a8List.add(toAdd);
		}
		Collections.sort(a8List);
		int index = Collections.binarySearch(a8List, 12);
		System.out.println(a8List);
		System.out.println(index);
	}
	
}
