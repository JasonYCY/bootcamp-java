import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoLambda {
  public static void main(String[] args) {
    // After Java 8: Lambda Expression
    // Functional Interface (One Method Interface)


    // Java Built-in Lambda Function
    // 1) Function
    Function<String, Integer> getStringLength = String::length;
    System.out.println(getStringLength.apply("ABCD"));

    Function<String, String> trimAndUpperCase = str -> str.trim().toUpperCase();
    System.out.println(trimAndUpperCase.apply("    Hello World!     "));

    Function<String, String> trimAndLowerCase = new Function<String, String>() {
      @Override
      public String apply(String str) {
        return str.trim().toLowerCase();
      };
    };
    System.out.println(trimAndLowerCase.apply("    Hello World!     "));


    // 2) BiFunction
    BiFunction<String, String, String> concat = (str1, str2) -> str1.concat(str2);
    System.out.println(concat.apply("Goodbye", " World"));

    BiFunction<Double, Double, Double> bmi = (weight, height) -> Math.floor(weight / (height * height) * 10) / 10;
    System.out.println("BMI: " + bmi.apply(51.0, 1.7));


    // 3) Consumer
    List<String> names = new ArrayList<>();
    names.add("Steven");
    names.add("John");
    names.add("Leo");

    // for (String name : names) {
    //   System.out.println(name);
    // }

    Consumer<String> printName = name -> System.out.println(name);
    names.forEach(printName);


    // 4) Supplier
    Supplier<Integer> markSixGenerator = () -> {
      Random random = new Random();
      int result = random.nextInt(49) + 1;
      return result;
    };
    System.out.println(markSixGenerator.get());


    // 5) Predicate
    Predicate<Person> isElderly = Person::isElderly;
    System.out.println("Is elderly: " + isElderly.test(new Person(66)));
    System.out.println("Is elderly: " + isElderly.test(new Person(65)));


    // Custom Functional Interface
    MathOperation addition = (x, y) -> x + y;
    MathOperation subtraction = (x, y) -> x - y;
    System.out.println(addition.calculate(5, 2));
    System.out.println(subtraction.calculate(4, 1));


    // Example: Map
    Map<Integer, String> studentMap = new HashMap<>();
    studentMap.put(1, "John");
    studentMap.put(2, "Mary");
    studentMap.put(3, "Sally");

    studentMap.computeIfAbsent(4, id -> "N/A");
    studentMap.computeIfAbsent(5, id -> "N/A");
    System.out.println(studentMap);





  }
}
