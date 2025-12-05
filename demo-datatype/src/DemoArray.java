public class DemoArray {
  public static void main(String[] args) {
    // Array
    String[] stringArr = new String[] {"apple", "banana", "kiwi"};
    System.out.println("\nPrinting string array:");
    for (int i = 0; i < stringArr.length; i++) {
      System.out.println("\tindex " + i + ": " + stringArr[i]);
    }

    char[] charArr = new char[] {'a', 'b', 'c'};
    System.out.println("\nPrinting char array:");
    for (int i = 0; i < charArr.length; i++) {
      System.out.println("\tindex " + i + ": " + charArr[i]);
    }

    boolean[] booleanArr = new boolean[] {true, false, true};
    System.out.println("\nPrinting boolean array:");
    for (int i = 0; i < booleanArr.length; i++) {
      System.out.println("\tindex " + i + ": " + booleanArr[i]);
    }



  }
}
