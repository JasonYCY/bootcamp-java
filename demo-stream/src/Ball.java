public class Ball {
  public static enum Color {
    RED,
    YELLOW,
    BLUE;
  }

  private Color color;
  private int num;

  public Ball(Color color, int num) {
    this.color = color;
    this.num = num;
  }

  public Color getColor() {
    return color;
  }

  public int getNum() {
    return num;
  }

  @Override
  public String toString() {
    return "Ball{color=" + color + ", num=" + num + "}";
  }
}
