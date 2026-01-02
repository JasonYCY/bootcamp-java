public class Person {
  private int age;

  public Person(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public boolean isElderly() {
    return age > 65;
  }
}
