public class Circle extends Shape {
  private int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  public int getRadius() {
    return radius;
  }

  @Override
  public double area() {
    return Math.PI * radius * radius;
  }
}
