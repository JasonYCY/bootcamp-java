public class Superman extends Human implements Flyable {
  // Super Class: Class or Abstract Class
  // Human has no abstract method
  public Superman(String name) {
    super(name);
  }

  // implementing interface ensures that an object can fly during compile time
  public void fly() {

  }
}
