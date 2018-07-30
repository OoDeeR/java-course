package hensel.plz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PLZModel implements PLZModelInterface {
	
	
	

	@Override
	public String sucheOrt(int plz) {
		try {
			Scanner scanner = new Scanner(new File("plz.txt"));
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				if (line.startsWith(String.format("%05d", plz))) {
					return line.split("\t")[1];
					
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			// scanner.close();
		}
		return "meh";
	}

}
