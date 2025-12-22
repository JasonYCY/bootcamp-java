package class_exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.stream.Collectors;

public class DataStructureExercise {
  public static void main(String[] args) {
    // Exercise 1: Array List Basic Operations

    // 1a. Create an ArrayList of integers.
    // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
    // 1c. Print all the elements in the list.
    // 1d. Remove the number 30 from the list.
    // 1e. Print the size of the list.
    System.out.println("\n====================== Exercise 1 ======================");
    ArrayList<Integer> intArr = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
    System.out.println("Elements in ArrayList: " + intArr);
    intArr.remove(Integer.valueOf(30));
    System.out.println("Size of list after removing 30: " + intArr.size());


    // Exercise 2: Search and Update

    // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Mango", and
    // "Orange".
    // 2b. Check if "Grapes" exists in the list.
    // 2c. If it doesn’t exist, add it to the list.
    // 2d. Update "Mango" to "Peach".
    // 2e. Print the final list.
    System.out.println("\n====================== Exercise 2 ======================");
    ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Mango", "Orange"));
    if (!fruits.contains("Grapes")) fruits.add("Grapes");
    fruits.set(2, "Peach");
    System.out.println("Final list: " + fruits);


    // Exercise 3: Remove Duplicates

    // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
    // 3b. Remove duplicates from the list using a HashSet.
    // 3c. Print the list after removing duplicates.
    System.out.println("\n====================== Exercise 3 ======================");
    ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(10, 20, 10, 30, 40, 20, 50));
    HashSet<Integer> uniqueIntegers = new HashSet<>(integers);
    System.out.println("Unique integers: " + uniqueIntegers);


    // Exercise 4: HashSet Basic Operations

    // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
    // 4b. Add "Canada" to the set.
    // 4c. Add "India" again. Print the result.
    // 4d. Print all elements in the set.
    System.out.println("\n====================== Exercise 4 ======================");
    HashSet<String> countries = new HashSet<>(Arrays.asList("USA", "India", "China", "Japan"));
    countries.add("Canada");
    countries.add("India");
    System.out.println("Countries: " + countries);


    // Exercise 5: Check the numbers

    // 5a. Create a HashSet of numbers: 1.1, 2.2, 3.3, 4.4, 5.5
    // 5b. Check if the set contains the number 3.3
    // 5c. Remove the number 2.2 from the set.
    // 5d. Print the size of the set.
    System.out.println("\n====================== Exercise 5 ======================");
    HashSet<Double> doubles = new HashSet<>(Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5));
    System.out.println("Set contains the number 3.3: " + doubles.contains(3.3));
    doubles.remove(2.2);
    System.out.println("Set size: " + doubles.size());


    // Exercise 6: Intersection of Sets

    // 6a. Create two HashSets:
    // 6b. Set 1: 10, 20, 30, 40
    // 6c. Set 2: 30, 40, 50, 60
    // 6d. Find the common numbers of the two sets.
    // 6e. Print the resulting set.
    System.out.println("\n====================== Exercise 6 ======================");
    HashSet<Integer> set1 = new HashSet<>(Arrays.asList(10, 20, 30, 40));
    HashSet<Integer> set2 = new HashSet<>(Arrays.asList(30, 40, 50, 60));
    set1.retainAll(set2);
    System.out.println("Common numbers in two sets: " + set1);


    // Exercise 7: Convert HashSet to ArrayList

    // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chloe", "Jenny", "Vicky".
    // 7b. Convert the HashSet to an ArrayList.
    // 7c. Print the converted list.
    System.out.println("\n====================== Exercise 7 ======================");
    HashSet<String> nameSet = new HashSet<>(Arrays.asList("Cherry", "Steve", "Chloe", "Jenny", "Vicky"));
    ArrayList<String> nameArray = new ArrayList<>(nameSet);
    System.out.println("Converted list: " + nameArray);


    // Exercise 8: ArrayList of Students
    // 8a. Create an ArrayList to store Student objects.
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    // 8b. Iterate over the ArrayList and print each student's details.
    // 8c. Remove the student Bob.
    // 8d. Write a static method to search for a student by ID and return their name. If the student is
    // not found,
    // return "Student not found".
    // 8e. Create another ArrayList to store student with name starts with 'A'
    System.out.println("\n====================== Exercise 8 ======================");
    ArrayList<Student> students = new ArrayList<>();
    students.add(new Student(1, "Alice"));
    students.add(new Student(2, "Bob"));
    students.add(new Student(3, "Charlie"));
    for (Student student : students) {
      System.out.println(student);
    }
    students.remove(new Student(2, "Bob"));
    int studentID = 1;
    System.out.println("search student by ID " + studentID + ": " + searchStudentNameByID(students, studentID));
    studentID = -1;
    System.out.println("search student by ID " + studentID + ": " + searchStudentNameByID(students, studentID));
    ArrayList<Student> filteredStudents = students.stream()
                                                  .filter(student -> student.getName().charAt(0) == 'A')
                                                  .collect(Collectors.toCollection(ArrayList::new));
    System.out.println("student with name starts with 'A': " + filteredStudents);


    // Exercise 9: HashSet of Students
    // 9a. Create two HashSets of Student objects:
    // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
    // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
    // 9b. Find the common students of the two sets
    // 9c. Print the result.
    System.out.println("\n====================== Exercise 9 ======================");
    HashSet<Student> class1 = new HashSet<>(Arrays.asList(
      new Student(1, "Alice"),
      new Student(2, "Bob"),
      new Student(3, "Charlie")
    ));
    System.out.println("Set 1: " + class1);
    HashSet<Student> class2 = new HashSet<>(Arrays.asList(
      new Student(2, "Bob"),
      new Student(3, "Charlie"),
      new Student(4, "David")
    ));
    System.out.println("Set 1: " + class2);
    HashSet<Student> commonStudents = new HashSet<>(class1);
    commonStudents.retainAll(class2);
    System.out.println("Common: " + commonStudents);


  }

  public static class Student {
    private int id;
    private String name;

    // Constructor
    public Student(int id, String name) {
      this.id = id;
      this.name = name;
    }

    // getter, setter, etc.
    public int getId() {
      return id;
    }

    public String getName() {
      return name;
    }

    public void setId(int id) {
      this.id = id;
    }

    public void setName(String name) {
      this.name = name;
    }

    @Override
    public String toString() {
      return "Student{id=" + id + ", name=" + name + "}";
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) return true;
      if (!(obj instanceof Student)) return false;

      Student student = (Student) obj;
      return name.equals(student.getName()) && id == student.getId();
    }

    @Override
    public int hashCode() {
      return Objects.hash(id, name);
    }
  }

  public static String searchStudentNameByID(ArrayList<Student> list, int studentID) {
    try {
      Student student = list.get(studentID);
      return student.getName();
    } catch (Exception e) {
      return "Student not found";
    }
  }
}