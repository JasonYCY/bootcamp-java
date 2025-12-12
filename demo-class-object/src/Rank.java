public enum Rank {
  ACE('A', 14, "Ace"),
  TWO('2', 2, "Two"),
  THREE('3', 3, "Three"),
  FOUR('4', 4, "Four"),
  FIVE('5', 5, "Five"),
  SIX('6', 6, "Six"),
  SEVEN('7', 7, "Seven"),
  EIGHT('8', 8, "Eight"),
  NINE('9', 9, "Nine"),
  TEN('T', 10, "Ten"),
  JACK('J', 11, "Jack"),
  QUEEN('Q', 12, "Queen"),
  KING('K', 13, "King");

  private final char symbol;
  private final int value;
  private final String fullName;

  Rank(char symbol, int value, String fullName) {
    this.symbol = symbol;
    this.value = value;
    this.fullName = fullName;
  }

  public char getSymbol() {
    return symbol;
  }

  public int getValue() {
    return value;
  }

  public String getFullName() {
    return fullName;
  }

  public String getDisplayString() {
    return (this == TEN) ? "10" : " " + symbol;
  }

  public static Rank fromChar(char c) {
    for (Rank rank : values()) {
      if (rank.symbol == Character.toUpperCase(c)) {
        return rank;
      }
    }
    throw new IllegalArgumentException("Invalid rank character: " + c);
  }

  public boolean isHigherThan(Rank other) {
    return this.value > other.value;
  }

  public boolean isLowerThan(Rank other) {
    return this.value < other.value;
  }

  public boolean isFaceCard() {
    return this == JACK || this == QUEEN || this == KING;
  }
}
