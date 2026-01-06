import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoList {
  public static void main(String[] args) {
    // Approaches to create ArrayList Object
    List<String> names1 = new ArrayList<>(List.of("John", "Peter"));
    List<String> names2 = List.of("John", "Peter");
    List<String> names3 = Arrays.asList("John", "Peter");
    
    // 1) Read element
    System.out.println("\n1) Read element");
    System.out.println(names1.getFirst());
    System.out.println(names2.getFirst());
    System.out.println(names3.getFirst());
    
    // 2) Add element ("Sally")
    System.out.println("\n2) Add element ('Sally')");
    System.out.println(names1.add("Sally"));
    // System.out.println(names2.add("Sally")); // UnsupportedOperationException
    // System.out.println(names3.add("Sally")); // UnsupportedOperationException
    
    
    // 3) Update element ("Peter" -> "Steven")
    System.out.println("\n3) Update element ('Peter' -> 'Steven')");
    System.out.println(names1.set(1, "Steven"));
    // System.out.println(names2.set(1, "Steven")); // UnsupportedOperationException
    System.out.println(names3.set(1, "Steven"));


    // Stream -> create a completely new structure to return
    // List.of() -> stream -> collect -> ArrayList()








  }
}
