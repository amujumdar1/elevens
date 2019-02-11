/**
 * This is a class that tests the Deck class.
 */
public class secondDeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = new String[] {"jack", "queen", "king"};
		String[] suits = new String[] {"blue", "red"};
		int[] pointValues = new int[] {11, 12, 13};
		secondDeck deck = new secondDeck(ranks, suits, pointValues);
		System.out.println(deck);
	}
}
