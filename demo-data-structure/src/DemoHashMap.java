import java.util.ArrayList;
import java.util.HashMap;

public class DemoHashMap {
  public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>();
    students.add(new Student("John", 30));
    students.add(new Student("Sally", 80));
    students.add(new Student("Leo", 90));

    HashMap<String, Student> studentMap = new HashMap<>();
    for (Student student : students) {
      studentMap.put(student.getName(), student);
    }
    System.out.println(studentMap.get("Sally"));





  }
}
