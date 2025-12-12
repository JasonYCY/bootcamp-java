public class Candy {
  private String color; // "RED", "YELLOW", "BLUE"

  public Candy(String color) {
    this.color = color;
  }

  public static Candy ofColor(String color) {
    return (color != null) ? new Candy(color) : new Candy("RED");
  }

  public String getColor() {
    return color;
  }

  @Override
  public String toString() {
    return color + " candy";
  }
}
