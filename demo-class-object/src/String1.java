public class String1 {
  // attribute
  private char[] charArr;

  // constructor
  public String1() {
    charArr = new char[0];
  }

  public String1(String str) {
    int length = str.length();
    charArr = new char[length];
    for (int i = 0; i < length; i++) {
      charArr[i] = str.charAt(i);
    }
  }

  public String1(char[] charArr) {
    this.charArr = charArr;
  }

  // method
  public String1 replace(char from, char to) {
    char[] newCharArr = new char[charArr.length];
    for (int i = 0; i < charArr.length; i++) {
      if (charArr[i] == from) {
        newCharArr[i] = to;
      } else {
        newCharArr[i] = charArr[i];
      }
    }
    return new String1(newCharArr);
  }

  public char charAt(int index) {
    return charArr[index];
  }

  public boolean contains(char target) {
    for (char c : charArr) {
      if (c == target) return true;
    }
    return false;
  }

  public boolean isEmpty() {
    return charArr.length == 0;
  }

  public int length() {
    return charArr.length;
  }

  @Override
  public String toString() {
    return new String(charArr);
  }




  // main method
  public static void main(String[] args) {
    String1 s1 = new String1("hello");
    System.out.println(s1);

    char c1 = s1.charAt(0); // h
    System.out.println(c1);

    boolean result = s1.contains('e'); // true
    System.out.println(result);

    String1 s2 = new String1("goodbye");
    String1 s3 = s2.replace('o', 'x');
    System.out.println(s2);
    System.out.println(s3);







  }
}
