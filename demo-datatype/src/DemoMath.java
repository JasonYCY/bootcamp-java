public class DemoMath {
  public static void main(String[] args) {
    // operators
    int remainder = 10 % 3;
    System.out.println(remainder);

    // int + double
    double sum = 3 + 3.5;
    System.out.println("sum: " + sum);

    // Special Case: byte + short -> int
    byte b10 = 9;
    short s10 = 9;
    // short s20 = b10 + s10
    int i20 = b10 + s10;
  }
}
