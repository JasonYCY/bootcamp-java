public class Person {
  // attribute
  private double height;
  private double weight;
  
  // constructor
  public Person() {}

  public Person(double height, double weight) {
    this.height = height;
    this.weight = weight;
  }
  
  // method
  public double getHeight() {
    return height;
  }

  public double getWeight() {
    return weight;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  // main method
  public static void main(String[] args) {
    Person p1 = new Person();
    p1.setHeight(173);
    p1.setWeight(79);

    Person[] persons = new Person[2];
    persons[0] = new Person();
    persons[1] = p1;

    for (Person person : persons) {
      System.out.println(person.getHeight());
      System.out.println(person.getWeight());
    }
  }
}
