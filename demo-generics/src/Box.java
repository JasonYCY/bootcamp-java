import java.util.List;

public class Box<T> {
  private T value;

  public Box() {
    this.value = null;
  }

  public Box(T value) {
    this.value = value;
  }

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  // the T here is different from the T in Box<T>
  // as static method belongs to class, so it can't access the T in object
  // if the method is non-static, then the T will shadow the T in object
  public static <T extends Shape> double totalArea2(List<T> shapes) {
    double total = 0;
    for (Shape shape : shapes) {
      total += shape.area();
    }
    return total;
  }



  // main method
  public static void main(String[] args) {
    // Compile Time -> confirm T
    Box<String> stringBox = new Box<>();
    Box<Integer> integerBox = new Box<>();
    stringBox.setValue("str");
    integerBox.setValue(123);

    Box<Object> magicBox = new Box<>();
    magicBox.setValue("str");
    magicBox.setValue(123);
  }
}
