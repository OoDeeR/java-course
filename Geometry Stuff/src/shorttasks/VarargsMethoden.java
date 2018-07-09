package shorttasks;

public class VarargsMethoden {
	
	static int sum(int... values) {
		int sum = 0;
		for (int i : values) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		int result;
		int[] intArr = {1,2,3,4,5,6};
		result = sum(intArr);
		System.out.println(result);
		result = sum(new int[] {3,3,3});
		System.out.println(result);
		
		result = sum();
		System.out.println(result);
		result = sum(1);
		System.out.println(result);
		result = sum(1,2);
		System.out.println(result);
		result = sum(1,2,3);
		System.out.println(result);
		result = sum(1,2,3,4);
		System.out.println(result);

	}
}
