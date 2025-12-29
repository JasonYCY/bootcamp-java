import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
  abstract double area();

  // Shape is the parent of Circle & Square
  // BUT, List<Shape> is not the parent of List<Circle> & List<Square> !!!
  public static double totalArea(List<Shape> shapes) {
    double total = 0;
    for (Shape shape : shapes) {
      total += shape.area();
    }
    return total;
  }

  public static <T extends Shape> double totalArea2(List<T> shapes) {
    double total = 0;
    for (Shape shape : shapes) {
      total += shape.area();
    }
    return total;
  }


  // main method
  public static void main(String[] args) {
    List<Circle> circles = new ArrayList<>();
    circles.add(new Circle(3));

    List<Square> squares = new ArrayList<>();
    squares.add(new Square(10));

    List<Shape> shapes = new ArrayList<>();
    shapes.add(new Circle(4));
    shapes.add(new Square(8));

    // totalArea(circles);
    // totalArea(squares);
    totalArea(shapes);

    totalArea2(circles);
    totalArea2(squares);
    totalArea2(shapes);
  }
}
