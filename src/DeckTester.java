/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
                // reusable assets
            String[] suits = {"clubs", "hearts", "diamonds", "spades"};
            String[] ranks = {"ace", "two", "three", "four", "five", "six",
                "seven", "eight", "nine", "ten", "jack", "queen", "king"};
            int[] pointValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
            
            // second deck
            String[] gang = {"lancers", "leprechauns", "cougars", "bois"};
            String[] teir = {"mouse", "cat", "dog", "turtle", "hare", "rabbit", "bunny", "bois", "gang", "community", "discord chat", "cult", "religion"};
            int[] power = {1, -1, 2, 3, 4, 5, 6, 7, 10, 11, 12, 15, 50};
            /**** Example deck 1 ****/
            System.out.println("-----TESTING DECK 1-----");
            // create a deck
            Deck dMoney = new Deck(ranks, suits, pointValues);
            // test size
            System.out.println(dMoney.size());
            //deal 1 card
            Card x = dMoney.deal();
            System.out.println("yo homie I just dealt you:" + x);
            System.out.println("Now my deck size is:" + dMoney.size());
            //test two strings
            System.out.println(dMoney);
            
            /**** Example deck 2 ****/
            System.out.println("-----TESTING DECK 2-----");
            // create a deck
            Deck dEasy = new Deck(teir, gang, power);
            // test size
            System.out.println(dEasy.size());
            //deal until empty
            while(!dEasy.isEmpty()){
                dEasy.deal();
            }
            System.out.println(dEasy);
            //test two strings
	}
}

