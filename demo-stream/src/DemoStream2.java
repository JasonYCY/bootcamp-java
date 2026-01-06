import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream2 {
  public static class Employee {
    private static int nextId;

    private int id;
    private LocalDate joinDate;
    private String name;
    private double salary;

    public Employee(LocalDate joinDate, String name, double salary) {
      this.id = nextId++;
      this.name = name;
      this.joinDate = joinDate;
      this.salary = salary;
    }

    public int getId() {
      return id;
    }

    public String getName() {
      return name;
    }

    public LocalDate getJoinDate() {
      return joinDate;
    }

    public double getSalary() {
      return salary;
    }

    @Override
    public String toString() {
      return "Employee{id=" + id + ", name=" + name + ", joinDate=" + joinDate + ", salary=" + salary + "}";
    }
  }

  public static void main(String[] args) {
    // Initialize employee list
    // Peter, 2020-OCT-23, 15000.0
    // John, 2019-JAN-31, 23000.0
    // Mary, 2022-MAY-05, 37000.0
    // Leo, 2002-DEC-10, 58000.0
    Employee peter = new Employee(LocalDate.of(2020, 10, 23), "Peter", 15000.0);
    Employee john = new Employee(LocalDate.of(2019, 1, 31), "John", 23000.0);
    Employee mary = new Employee(LocalDate.of(2022, 5, 5), "Mary", 37000.0);
    Employee leo = new Employee(LocalDate.of(2002, 12, 10), "Leo", 58000.0);
    
    List<Employee> employeeList = new ArrayList<>(List.of(peter, john, mary, leo));
    employeeList.forEach(System.out::println);

    // Find all of their salary
    List<Double> salaries = employeeList.stream()
      .map(employee -> employee.getSalary())
      .collect(Collectors.toList());
    System.out.println(salaries);

    // Find all of their join dates
    List<LocalDate> joinDates = employeeList.stream()
      .map(Employee::getJoinDate)
      .toList();
    System.out.println(joinDates);

    // Find all employee names, who joined the company before 2020-JAN-01
    List<String> employeeNames = employeeList.stream()
      .filter(employee -> employee.getJoinDate().isBefore(LocalDate.of(2020, 1, 1)))
      .map(Employee::getName)
      .toList();
    System.out.println(employeeNames);

    // Find all employee with salary > 25000.0
    List<Employee> highSalaryEmployees = employeeList.stream()
      .filter(employee -> employee.getSalary() > 25000.0)
      .toList();
    System.out.println(highSalaryEmployees);

    // Java 8
    Stream<String> names = Stream.of("John", "Peter", "Leo");
    long numberOfNamesLongerThanFourChar = names.filter(name -> name.length() > 4).count();
    System.out.println(numberOfNamesLongerThanFourChar);

    List<Integer> markSix = Stream.generate(() -> new Random().nextInt(49) + 1).distinct().limit(6).toList();
    System.out.println(markSix);

    // The relationship between the Intermediate and Terminal Operation
    long testMap = employeeList.stream()
      .map(employee -> {
        System.out.println("Test Map!!!"); // map is not executed
        return employee.getSalary(); // Java optimizes code by skipping useless operation
      })
      .count();
    System.out.println(testMap);






  }
}
