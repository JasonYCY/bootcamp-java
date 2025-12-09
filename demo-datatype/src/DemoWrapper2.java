public class DemoWrapper2 {
  public static void main(String[] args) {
    // Different ways to create Integer object
    // Integer x1 = 3;
    // Integer x2 = new Integer(3); // Deprecated
    // Integer x3 = Integer.valueOf(3);

    // Double object
    // Double d1 = 0.5;
    // Double d2 = new Double(0.5); // Deprecated
    // Double d3 = Double.valueOf(0.5);

    // String object (non-wrapper class)
    // String s1 = "hello";
    // String s2 = new String("hello");
    // String s3 = String.valueOf("hello");

    // Integer caches integer from -128 to 127, so valueOf return cached Integer 127
    // Integer i1 = Integer.valueOf(127); // returns cached Integer
    // Integer i2 = Integer.valueOf(127); // returns cached Integer
    // System.out.println(i1.equals(i2)); // true (checks the value)
    // System.out.println(i1 == i2); // true (checks the address)

    // 128 is outside the cache range, so new memory is allocated for Integer 128
    // Integer i3 = Integer.valueOf(128); // allocates new memory
    // Integer i4 = Integer.valueOf(128); // allocates new memory
    // System.out.println(i3.equals(i4)); // true (checks the value)
    // System.out.println(i3 == i4); // false (checks the address)

    // the "new" keyword forces JVM to create new object
    // Integer i5 = new Integer(127); // allocates new memory
    // Integer i6 = new Integer(127); // allocates new memory
    // System.out.println(i5.equals(i6)); // true (checks the value)
    // System.out.println(i5 == i6); // false (checks the address)
  }
}
