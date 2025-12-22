import java.util.ArrayList;
import java.util.HashSet;

public class DemoHashSet {
  public static void main(String[] args) {
    // Java Collection: List / Set / Queue / Stack
    // Properties of Set:
    // 1) Avoid duplicates
    HashSet<String> names = new HashSet<>();
    names.add("Tommy");
    names.add("Jenny");
    names.add("Tommy");
    System.out.println("Size of Hash Set: " + names.size());
    System.out.println("Content: " + names);

    ArrayList<Integer> ages = new ArrayList<>();
    ages.add(15);
    ages.add(30);
    ages.add(15);
    ages.add(45);

    HashSet<Integer> ageSet = new HashSet<>();
    for (Integer age : ages) {
      if (!ageSet.add(age)) {
        System.out.println("Duplicated Element: " + age);
      }
    }
    System.out.println("Age List: " + ages);
    System.out.println("Age Set: " + ageSet);

    HashSet<Student> students = new HashSet<>(); // equals() & hashCode()
    students.add(new Student("John", 80));
    students.add(new Student("Jenny", 70));
    students.add(new Student("John", 80));
    System.out.println("Students: " + students);

    HashSet<Integer> ages3 = new HashSet<>(ages);
    System.out.println(ages3);
  }
}
