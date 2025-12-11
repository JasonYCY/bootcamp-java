import java.util.Random;

public class ShuffleHelper {
  // attribute
  private Card[] cards;
  private Random random;

  // constructor
  public ShuffleHelper(Card[] cards) {
    this.cards = cards;
    this.random = new Random();
  }

  // method
  // Method 1: Proper Fisher-Yates shuffle (standard algorithm)
  public void shuffle() {
    // Start from the last element and swap with random element
    for (int i = cards.length - 1; i > 0; i--) {
      int j = random.nextInt(i + 1); // Random index from 0 to i
      
      // Swap cards[i] with cards[j]
      Card temp = cards[i];
      cards[i] = cards[j];
      cards[j] = temp;
    }
  }

  // Method 2: Do multiple Fisher-Yates shuffle (multiple passes)
  public void shuffleMultipleTimes(int numberOfPasses) {
    for (int pass = 0; pass < numberOfPasses; pass++) {
      // Do one Fisher-Yates shuffle per pass
      for (int i = cards.length - 1; i > 0; i--) {
        int j = random.nextInt(i + 1);
        
        Card temp = cards[i];
        cards[i] = cards[j];
        cards[j] = temp;
      }
    }
  }

  // Method 3: Random Pairwise Swaps
  public void shuffleWithSwaps(int numberOfSwaps) {
    for (int i = 0; i < numberOfSwaps; i++) {
      int index1 = random.nextInt(cards.length);
      int index2 = random.nextInt(cards.length);
      
      // Only swap if they're different
      if (index1 != index2) {
        Card temp = cards[index1];
        cards[index1] = cards[index2];
        cards[index2] = temp;
      }
    }
  }



  // main method
  public static void main(String[] args) {
    // test
    Deck deck = new Deck();
    ShuffleHelper helper = new ShuffleHelper(deck.getCards());
    helper.shuffleMultipleTimes(3);
    System.out.println(deck);













  }
}
