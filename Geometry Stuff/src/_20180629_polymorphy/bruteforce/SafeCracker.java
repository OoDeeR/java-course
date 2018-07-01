package _20180629_polymorphy.bruteforce;

import java.util.Random;

public class SafeCracker {

	public static void main(String[] args) {
		char[] combi = { 'a', 'b', 'c', 'd' };
		char[] guess = { 'a', 'a', 'a', 'a' };
		Safe safe = new Safe(combi);
		Random rand = new Random();
		int tries = 0;

		// randomGuess(combi, guess, tries, rand, safe);
		consecutiveGuess(combi, guess, tries, safe);

	}

	public static void randomGuess(char[] combi, char[] guess, int tries, Random rand, Safe safe) {
		while (!safe.open(guess)) {
			for (int i = 0; i < combi.length; i++) {
				guess[i] = (char) (rand.nextInt('z' - 'a') + 'a');
			}
			safe.open(guess);
			tries++;
		}
		System.out.println("The correct combination was " + new String(guess) + ". (Tries: " + tries + ")");
	}

	public static void consecutiveGuess(char[] combi, char[] guess, int tries, Safe safe) {
		while (!safe.open(guess)) {
			for (int i = combi.length - 1; i >= 0; i--) {
				for (int j = ('a'); j <= ('z'); j++) {

					guess[i] = (char) (j);
					safe.open(guess);
					tries++;

				}
			}
		}
		System.out.println("The correct combination was " + new String(guess) + ". (Tries: " + tries + ")");
	}

}
