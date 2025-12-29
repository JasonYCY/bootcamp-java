public class DemoException {
  // other methods
  public static char getFirstCharacter(String str) {
    if (str == null) throw new IllegalArgumentException("Argument cannot be null!");
    return str.charAt(0);
  }
  
  
  
  // main method
  public static void main(String[] args) {
    // Java
    // 1) Class and Object (return)
    // 2) Exception Object (throw)

    // 2.1) ArrayIndexOutOfBoundsException
    // int[] arr = new int[]{3, 4};
    // System.out.println(arr[arr.length]);

    // 2.2) StringIndexOutOfBoundsException
    // String str = "hello";
    // System.out.println(str.charAt(-1));

    // 2.3) NullPointerException
    // String nullPtr = null;
    // nullPtr.charAt(0);

    // 2.4) IllegalArgumentException
    // throw new IllegalArgumentException("<Write your error message here>");

    // 2.5) NumberFormatException
    // System.out.println(Integer.valueOf("Ciallo~ (∠・ω< )⌒☆"));

    // 2.6) ArithmeticException
    // System.out.println(1 / 0);



    // try-catch
    try {
      System.out.println("Check Point 1");
      getFirstCharacter(null);
      System.out.println("Check Point 2"); // this line won't be executed
    } catch (Exception e) {
      System.out.println("Exception caught! Exception message: " + e.getMessage());
    }





  }
}