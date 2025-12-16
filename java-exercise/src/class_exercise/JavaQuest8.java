public class JavaQuest8 {
  /**
   * Write a loop to find the second max number.
   * Example Output for testCase1:
   * Second Max = 230
   */
  public static int findSecondMax(int[] arr) {
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;

    for (int currentNumber : arr) {
      if (currentNumber > max) {
        secondMax = max;
        max = currentNumber;
      } else if (currentNumber > secondMax) {
        secondMax = currentNumber;
      }
    }

    return secondMax;
  }
  
  public static void main(String[] args) {
    int[] testCase1 = new int[] {-10, 5, 100, 240, 230, 80}; // Second Max = 230
    int[] testCase2 = new int[] {-10, 5, 100, 120, 240, 200}; // Second Max = 200
    int[] testCase3 = new int[] {-10, 5, 120, -100, 100, 240}; // Second Max = 120
    int[] testCase4 = new int[] {-10, 5, 100, 240, 240, 80}; // Second Max = 240

    // Your program should be able to handle all the above test case.
    int secondMax;
    
    // code here ...
    secondMax = findSecondMax(testCase1);
    System.out.println("(Test Case 1) Second Max = " + secondMax);

    secondMax = findSecondMax(testCase2);
    System.out.println("(Test Case 2) Second Max = " + secondMax);

    secondMax = findSecondMax(testCase3);
    System.out.println("(Test Case 3) Second Max = " + secondMax);

    secondMax = findSecondMax(testCase4);
    System.out.println("(Test Case 4) Second Max = " + secondMax);



  }
}