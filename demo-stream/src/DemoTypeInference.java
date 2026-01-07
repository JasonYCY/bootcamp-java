import java.util.HashMap;
import java.util.LinkedList;

public class DemoTypeInference {
  // public static int sum(var x, var y) {
  //   return x + y;
  // }

  // public static var sum(int x, int y) {
  //   return x + y;
  // }

  // private var name = "John";



  public static void main(String[] args) {
    String john = "John";
    System.out.println(john);

    var email = "john@gmail.com";
    System.out.println(email);
    System.out.println(email instanceof String);

    var integers = new LinkedList<Integer>();
    integers.add(100);

    var fruitMap = new HashMap<String, String>();
    fruitMap.put("abc", "apple");

    var cat = Cat.builder().age(1).name("Cat").build();
    System.out.println(cat);




  }
}
