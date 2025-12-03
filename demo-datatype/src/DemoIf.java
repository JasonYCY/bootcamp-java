public class DemoIf {
  public static void printSeparationLine() {
    System.out.println("=".repeat(70));
  }

  public static void main(String[] args) {
    // if-statement
    int x = 10;
    printSeparationLine();
    System.out.println("x: " + x);
    printSeparationLine();

    if (x % 2 == 1) {
      System.out.println("x is odd");
    } else {
      System.out.println("x is even");
    }

    if (x > 3) {
      System.out.println("x is larger than 3");
    }
    printSeparationLine();

    // exercise 1 (if x > 3 and even -> balance + 10, else balance + 5)
    System.out.println("-= Exercise 1 =-");
    int balance = 0;
    System.out.println("initial balance: " + balance);

    System.out.println("[Checking whether x is larger than 3 and even...]");
    if ((x > 3) && (x % 2 == 0)) {
      System.out.println("[true, balance + 10!]");
      balance += 10;
    } else {
      System.out.println("[false, balance + 5!]");
      balance += 5;
    }
    System.out.println("new balance: " + balance);
    printSeparationLine();

    // exercise 2
    System.out.println("-= Exercise 2 =-");
    boolean isFemale = false;
    boolean isSmoker = true;
    int age = 66;

    /*
     * premium base $100
     * 
     * if (female and above 40), 20% more premium
     * 
     * if (male and smoker), 50% more premium
     * 
     * if (female and smoker), 5% more premium
     * 
     * if (female or male) and (age >= 70), 40% more premium
     */
    double premiumPrice = 100;
    int additionalPercentage = 0;
    System.out.println("Original premiumPrice: $" + premiumPrice);
    System.out.println(
        "Original additionalPercentage: " + additionalPercentage + "%");

    System.out.println();
    if (isFemale && age > 40) {
      System.out.println("[Condition 1  true!]");
      additionalPercentage += 20;
    }

    if (!isFemale && isSmoker) {
      System.out.println("[Condition 2 true!]");
      additionalPercentage += 50;
    }

    if (isFemale && isSmoker) {
      System.out.println("[Condition 3 true!]");
      additionalPercentage += 5;
    }

    if ((isFemale || !isFemale) && age >= 70) {
      System.out.println("[Condition 4 true!]");
      additionalPercentage += 40;
    }

    premiumPrice = premiumPrice * (1 + (double) additionalPercentage / 100);
    System.out.println(
        "[Calculating additionalPercentage and new premiumPrice...]\n");


    System.out.println("New premiumPrice: $" + premiumPrice);
    System.out
        .println("New additionalPercentage: " + additionalPercentage + "%");
    printSeparationLine();
  }
}
