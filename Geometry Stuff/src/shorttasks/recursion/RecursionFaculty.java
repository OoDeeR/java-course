package shorttasks.recursion;

public class RecursionFaculty {

	public static void main(String[] args) {
		
		System.out.println(getFaculty(4));
		
	}
	
	static int getFaculty(int n) {
	      if (n <= 1)
	            return 1;
	      else
	            return n * getFaculty(n - 1);
	}

}
