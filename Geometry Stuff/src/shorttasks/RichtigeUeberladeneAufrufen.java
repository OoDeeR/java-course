package shorttasks;

public class RichtigeUeberladeneAufrufen {
	
//	static void print() { System.out.println("noargs"); }
	
//	static void print(int x) { System.out.println("int"); }
//	static void print(long x) { System.out.println("long"); }
//	static void print(double x) { System.out.println("double"); }
	
//	static void print(Integer x) { System.out.println("Integer"); }
//	static void print(Float x) { System.out.println("Float"); }
	
//	static void print(Number x) { System.out.println("Number"); }
	static void print(Comparable<Integer> x) { System.out.println("Comparable"); }

//	static void print(int... x) { System.out.println("int..."); }
//	static void print(Integer... x) { System.out.println("Integer..."); }


	public static void main(String[] args) {
		Integer x = 22;
		print(x);
	}

	/*
	 * Die Reihenfolge in der die Methoden in der Klasse definiert sind spielt keine Rolle!
	 */
	
	/* 
	 * Die Schritte, die der Compiler bei der Suche nach der (gemeinten) überladenen Methode macht.
	 *
	 * 		******** Für Wrapper-Klassen-Referenz als Argument: ********
	 * 1. Die Methode suchen, die exakt denselben Parametertyp hat
	 * 2. Suche nach der Methode mit dem Parameter vom Basistyp. 
	 * 3. Autounboxing
	 * 3.a Widening nach Autounboxing (aber kein Wiederautoboxing nach Widening)
	 * 		byte -> short -> int -> long -> float -> double
	 * 
	 * X. Die vorherigen Schritte für varargs-Parameter versuchen
	 * 
	 * 
	 * 		******** Für Referenz als Argument: ********
	 * 1. Die Methode suchen, die exakt denselben Parametertyp hat
	 * 2. Suche nach der Methode mit dem Parameter vom Basistyp. 
	 * X. Die vorherigen Schritte für varargs-Parameter versuchen
	 * 
	 * 
	 * 		******** Für primitives Argument: ********
	 * 
	 * 1. Die Methode suchen, die exakt denselben Parametertyp hat
	 * 2. Compiler führt Widening durch
	 *        byte -> short -> int -> long -> float -> double
	 * 3. Autoboxing. Suche nach der Methode mit dem Wrapper-Klassen-Parameter
	 *        (kein Widening+Autoboxing)
	 * 3.a 	Nach dem Autoboxing. Suche nach der Methode mit dem Parameter vom Basistyp. 
	 *   
	 * 
	 * X. Die vorherigen Schritte für varargs-Parameter versuchen
	 * 
	 */
	
}
