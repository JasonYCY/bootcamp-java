import java.util.Arrays;

public class Student {
  private String name;
  private Candy[] candies;

  public Student(String name) {
    this.name = name;
    candies = new Candy[0];
  }

  public void receiveCandy(Candy candy) {
    System.out.println("Student " + name + " is receiving a candy!");
    Candy[] newCandies = new Candy[candies.length + 1];
    for (int i = 0; i < candies.length; i++) {
      newCandies[i] = candies[i];
    }
    newCandies[newCandies.length - 1] = candy;
    candies = newCandies;
  }

  public boolean eatCandy() {
    if (candies.length <= 0) {
      System.out.println("Student " + name + " has no candy left! Can't eat more candies!");
      return false;
    }
    System.out.println("Student " + name + " is eating a candy!");
    Candy[] newCandies = new Candy[candies.length - 1];
    for (int i = 0; i < newCandies.length; i++) {
      newCandies[i] = candies[i];
    }
    candies = newCandies;
    return true;
  }

  public void remainingCandies() {
    System.out.println("Student " + name + " has " + candies.length + " candies left");
  }

  public void showCandies() {
    System.out.println("Student " + name + "'s candies list: " + Arrays.toString(candies));
  }

  public String getName() {
    return name;
  }

  public Candy[] getCandies() {
    return candies;
  }
}
