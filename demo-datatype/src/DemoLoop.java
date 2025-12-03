public class DemoLoop {
  public static void main(String[] args) {
    // for-loop
    // for (int i = 0; i < 3; i++) {
    // System.out.println("Hi, current i = " + i);
    // }

    // print "Hello!" 50 times
    // for (int i = 0; i < 50; i++) {
    // System.out.println("Hello!");
    // }

    // range 0 to 100, print even number
    // for (int i = 0; i < 101; i++) {
    // if (i % 2 == 0) {
    // System.out.println(i + "\tis even!");
    // }
    // }

    // range 0 to 20, print odd numbers and the number > 5
    // for (int i = 0; i < 21; i++) {
    // if (i > 5 && i % 2 == 1) {
    // System.out.println(i + "\tis odd!");
    // }
    // }

    // leap year
    // Rule 1: Divisible by 4
    // Rule 2: EXCEPT if divisible by 100
    // Rule 3: UNLESS also divisible by 400
    // for (int currentYear = 2000; currentYear <= 2200; currentYear++) {
    // boolean isLeapYear = false;

    // if (currentYear % 4 == 0) {
    // if (currentYear % 100 == 0) {
    // if (currentYear % 400 == 0) {
    // // is a leap year
    // isLeapYear = true;
    // } else {
    // // is not a leap year
    // }
    // } else {
    // // is a leap year
    // isLeapYear = true;
    // }
    // } else {
    // // is not a leap year
    // }

    // // Simple Implementation
    // // isLeapYear = (currentYear % 400 == 0)
    // // || (currentYear % 4 == 0 && currentYear % 100 != 0);

    // if (isLeapYear) {
    // System.out.println(currentYear + " is a leap year!");
    // }
    // }

    // sum up 1 to 100
    // int sum = 0;
    // for (int i = 1; i < 101; i++) {
    // sum += i;
    // }
    // System.out.println("The sum from 1 to 100 = " + sum);
    // System.out.println("(1 + 100) * 100 / 2 = " + ((1 + 100) * 100 / 2));

    // range 1 to 100, how many numbers are divisible by 6
    // sum = 0;
    // for (int i = 1; i < 101; i++) {
    // if (i % 6 == 0) {
    // sum += 1;
    // System.out.println(sum + ")\t" + i);
    // }
    // }
    // System.out.println("range 1 to 100, how many numbers are divisible by 6?");
    // System.out.println("Answer: " + sum);

    // convert 1 to 100 to char values, then concat them together
    // String str = "";
    // for (int i = 1; i < 101; i++) {
    // str = str + (char) i;
    // }
    // System.out.println("Concatenated string: \n" + str);

  }
}
