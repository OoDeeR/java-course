package hensel.day1_exceptions;

public class ExceptionTest {

	public static void main(String[] args) {
		int i = 7;
		int j = 0;
		int erg = 0;
		String s = null;
		
		
		try {
			System.out.println(s.length());
			erg = i/j;
			} catch(ArithmeticException e) {
//				if (e == ArithmeticException)
				System.out.println("div/0");
//			} catch(NullPointerException e) {	//unüblich NPE zu fangen
//				if (e == ArithmeticException)
//				System.out.println("nullp");
			}catch(RuntimeException e) {
//				if (e == ArithmeticException)
				System.out.println("runtime");
			}
			
		System.out.println(erg);
		System.out.println("test");
	}

}
