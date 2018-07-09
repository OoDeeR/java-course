package shorttasks;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaTiere {
	
		
	static Supplier<Tier[]> tierArraySupplier = () -> new Tier[] {
			new Tier("Rex"), new Tier("Lassie", false)
	};
	
	
	static Consumer<Tier[]> printer =  tiere -> {
		for (Tier tier : tiere) {
			System.out.println(tier);
		}
	};
	

	public static void main(String[] args) {

		Tier[] tiere = tierArraySupplier.get();
		printer.accept(tiere);
		
		Predicate<Tier> testGesund = t -> t.isGesund();
		Tier[] gesundeTiere = extract(tiere, testGesund);
		

	}

}
