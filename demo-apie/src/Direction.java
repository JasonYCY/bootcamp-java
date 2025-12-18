public enum Direction {
  NORTH('N', 1),
  EAST('E', 2),
  SOUTH('S', -1),
  WEST('W', -2);

  private char value;
  private int number;

  private Direction(char value, int number) {
    this.value = value;
    this.number = number;
  }

  public char getValue() {
    return value;
  }

  public boolean isOpposite(Direction other) {
    return (this == NORTH && other == SOUTH) ||
           (this == SOUTH && other == NORTH) ||
           (this == EAST && other == WEST) ||
           (this == WEST && other == EAST);
  }

  public Direction getOpposite() {
    for (Direction dir : Direction.values()) {
      if (this.number * -1 == dir.number) {
        return dir;
      }
    }
    return null;
  }
  

  // main method for demonstration purposes
  public static void main(String[] args) {
    Direction dir1 = Direction.NORTH;
    Direction dir2 = Direction.SOUTH;
    System.out.println("Direction 1: " + dir1 + " (" + dir1.getValue() + ")");
    System.out.println("Direction 2: " + dir2 + " (" + dir2.getValue() + ")");
    System.out.println("Are Direction 1 and Direction 2 opposite? " + dir1.isOpposite(dir2));

    Direction dir3 = Direction.EAST;
    System.out.println("Direction 3: " + dir3 + " (" + dir3.getValue() + ")");
    System.out.println("Are Direction 1 and Direction 3 opposite? " + dir1.isOpposite(dir3));

    System.out.println("Opposite of Direction 1: " + dir1.getOpposite());
    System.out.println("Opposite of Direction 3: " + dir3.getOpposite());
  }
}
