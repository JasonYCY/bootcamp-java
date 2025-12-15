import java.math.BigDecimal;
import java.util.Objects;

public class Rectangle extends Shape {
  private double width;
  private double height;

  public Rectangle(String color, double width, double height) {
    super(color);
    this.width = width;
    this.height = height;
  }

  @Override
  public double area() {
    return BigDecimal.valueOf(width).multiply(BigDecimal.valueOf(height)).doubleValue();
  }

  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  @Override
  public String toString() {
    return "Rectangle(" + super.toString() + ", width=" + width + ", height=" + height + ")";
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) return true;
    if (!(obj instanceof Rectangle)) return false;

    Rectangle rectangle = (Rectangle) obj;
    return rectangle.getWidth() == this.width
        && rectangle.getHeight() == this.height
        && rectangle.getColor().equals(super.getColor());
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, super.getColor());
  }



  // main method
  public static void main(String[] args) {
    // test
    Rectangle rectangle1 = new Rectangle("Blue", 10, 5);
    Rectangle rectangle2 = new Rectangle("Blue", 10, 5);

    System.out.println(rectangle1.area());
    System.out.println(rectangle1.equals(rectangle2));
    System.out.println(rectangle1.hashCode() == rectangle2.hashCode());
    System.out.println(rectangle1);
    System.out.println(rectangle2);






  }
}
