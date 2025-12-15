import java.math.BigDecimal;
import java.util.Objects;

public class Circle extends Shape {
  private double radius;

  public Circle(String color, double radius) {
    super(color);
    this.radius = radius;
  }

  @Override
  public double area() {
    return BigDecimal.valueOf(Math.PI) //
        .multiply(BigDecimal.valueOf(radius)) //
        .multiply(BigDecimal.valueOf(radius)) //
        .doubleValue();
  }

  public double getRadius() {
    return radius;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) return true;
    if (!(obj instanceof Circle)) return false;

    Circle circle = (Circle) obj;
    return circle.getColor().equals(super.getColor())
        && circle.getRadius() == this.radius;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.getColor(), this.radius);
  }

  @Override
  public String toString() {
    return "Circle(" + super.toString() + ", radius=" + this.radius + ")";
  }



  // main method
  public static void main(String[] args) {
    // test
    Circle circle1 = new Circle("Red", 3.5);
    Circle circle2 = new Circle("Red", 3.5);

    System.out.println(circle1.equals(circle2));
    System.out.println(circle1.hashCode() == circle2.hashCode());
    System.out.println(circle1);
    System.out.println(circle2);



  }
}
