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
