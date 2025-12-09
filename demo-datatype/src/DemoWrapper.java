public class DemoWrapper {
  public static void main(String[] args) {
    // Wrapper Class
    // 8 Primitives -> 8 Wrapper Classes
    Integer integer = 3; // Auto box
    System.out.println(integer); // 3

    // Never use: >, <, >=, <=, == for Wrapper Class
    System.out.println(integer.equals(3)); // true
    System.out.println(integer.compareTo(3)); // 0
    System.out.println(integer.compareTo(2)); // 1
    System.out.println(integer.compareTo(4)); // -1

    // Auto unbox
    int x = integer;
    System.out.println(x);
  }
}
