/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card firstCard = new Card("Ace", "Spade", 1);
		Card secondCard = new Card("Ace", "Spade", 1);
		Card thirdCard = new Card("Ace", "Diamonds", 1);
		System.out.println(firstCard.matches(secondCard));
		System.out.println(secondCard.matches(thirdCard));
		System.out.println(thirdCard.matches(firstCard));
		System.out.println(firstCard.suit() + firstCard.rank() + firstCard.pointValue());
		System.out.println(secondCard.suit() + secondCard.rank() + secondCard.pointValue());
		System.out.println(thirdCard.suit() + thirdCard.rank() + thirdCard.pointValue());

		System.out.println(firstCard + " " + secondCard + " " + thirdCard);
	}
}
