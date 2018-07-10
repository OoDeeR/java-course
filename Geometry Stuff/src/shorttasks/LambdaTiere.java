package shorttasks;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaTiere {
	
		
	static Supplier<Tier[]> tierArraySupplier = () -> new Tier[] {
			new Tier("Rex"), new Tier("Lassie", false), new Tier("Hasso",true), new Tier("Wuff")
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
		
		System.out.println("---gesunde Tiere---");
		printer.accept(gesundeTiere);
		
		Predicate<Tier> testKrank = t -> !t.isGesund();
		Tier[] krankeTiere = extract(tiere, testKrank);
		
		System.out.println("---kranke Tiere---");
		printer.accept(krankeTiere);
		
	}
	
	public static Tier[] extract(Tier[] t, Predicate<Tier> g) {
		int len = 0;
		for(Tier tier : t) {
			if(g.test(tier)) {
				len++;
			}
		}
		Tier[] gTiere = new Tier[len];
		
		int i = 0;
		for (Tier tier : t) {
			if(g.test(tier)) {
				gTiere[i++] = tier;
			}
		}
		
		return gTiere;
	}

}
