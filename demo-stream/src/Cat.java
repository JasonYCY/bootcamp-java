public class Cat {
  private String name;
  private int age;

  private Cat(Builder builder) {
    this.name = builder.name;
    this.age = builder.age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public String toString() {
    return "Cat{name=" + name + ", age=" + age + "}";
  }

  public static class Builder {
    private String name;
    private int age;

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder age(int age) {
      this.age = age;
      return this;
    }

    public Cat build() {
      return new Cat(this);
    }
  }



  // main method
  public static void main(String[] args) {
    Cat cat = Cat.builder()
      .name("John")
      .age(19)
      .build();
    System.out.println(cat);









  }
}
