package shorttasks;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class TestInterfacesUtilityFunctions {

	public static void main(String[] args) {
//		TestConsumer();
//		TestSupplier();
		TestFunction();


	}

	public static void TestConsumer() {
		// Consumer<String> c1 = new Consumer<String>() {
		// @Override
		// public void accept(String param) {
		// param = param.toUpperCase();
		// System.out.println(param);
		//
		// }
		// };
		Consumer<String> str = x -> System.out.println(x.toUpperCase());
		str.accept("Hello world!");
	}

	public static void TestSupplier() {
//		Supplier<int[]> s1 = new Supplier<int[]>() {
//			@Override
//			public int[] get() {
//				return new int[] { 1, 2, 3, 4 };
//			}
//		};
		Supplier<int[]> s1 = () -> new int[] {1,2,3,4};
		int[] s1 = s1.get();
	}
	
	public static void TestFunction() {
//		Function<String, Integer> stringToInteger = new Function<String, Integer>() {
//			@Override
//			public Integer apply(String s) {
//				return Integer.parseInt(s);
//			}
//		};
//		Integer i1 = stringToInteger.apply("12345");
//		System.out.println(i1);
		
		Function<String, Integer> stringToInteger = s -> Integer.parseInt(s);
		Integer i1 = stringToInteger.apply("12345");
		System.out.println(i1);
		
	}
}
