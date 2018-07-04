package _20180702_interfaces.short_task;

interface Operation{
	default int add(int a, int b) {
		return a + b;
	}
}

class Sum implements Operation{}

public class Default implements Operation{

	public static void main(String[] args) {
		Operation sum = new Sum();
		int result = sum.add(3, 5);
		System.out.println(result);
	}

	@Override
	public int add(int a, int b) {
		int result = a + b;
		return result;
	}

}
