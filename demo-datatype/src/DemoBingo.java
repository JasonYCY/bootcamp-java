import java.util.Random;
import java.util.Scanner;

public class DemoBingo {
  // ANSI Escape Codes
  private static final String RESET = "\u001B[0m";
  private static final String RED = "\u001B[31m";
  private static final String GREEN = "\u001B[32m";
  private static final String BLUE = "\u001B[34m";
  private static final String GOLD = "\u001B[38;5;214m";

  public static void main(String[] args) {
    /**
     * A two-player number guessing game (Bingo Game).
     * Players A and B take turns guessing a secret number between 1 and 100.
     * After each guess, the range is narrowed based on feedback until someone guesses correctly.
     * 
     * If a player inputs a number outside the current valid range,
     * they must input again (without switching to the other player).
     */

    // Initialization
    int bingoNumber = new Random().nextInt(100) + 1;
    int lowerBound = 1;
    int upperBound = 100;
    int round = 1;
    char currentUser = 'A';
    Scanner scanner = new Scanner(System.in);
    System.out.println(BLUE + "A random number from 1 to 100 has been generated!\n" + RESET);
    System.out.println(RED + "[Debug] bingo number = " + bingoNumber + " (This is only for debugging, please remove this println after testing!)\n" + RESET);
    
    // Main loop
    while (true) {
      // Prompt user to input number
      System.out.print(GREEN + "(Round " + round + " - User " + currentUser + ") Please input a number from " + lowerBound + " to " + upperBound + ": " + RESET);

      // If the user doesn't input a number, ask the user to input again
      while (!scanner.hasNextInt()) {
        System.out.println(RED + "Please enter a valid number!" + RESET);
        scanner.next(); // Clear invalid input
        System.out.print(GREEN + "(Round " + round + " - User " + currentUser + ") Please input a number from " + lowerBound + " to " + upperBound + ": " + RESET);
      }
      int userInput = scanner.nextInt();

      //  If the user's input isn't within the range, ask the user to input again
      if (userInput < lowerBound || userInput > upperBound) {
        System.out.println(RED + "Your input number is not within the range! Please enter a valid number!" + RESET);
        continue;
      }

      // Compare user's input with the bingo number
      if (userInput < bingoNumber) {
        System.out.println(BLUE + "Your input number is smaller than the secret number!\n" + RESET);
        lowerBound = userInput + 1;
      } else if (userInput > bingoNumber) {
        System.out.println(BLUE + "Your input number is greater than the secret number!\n" + RESET);
        upperBound = userInput - 1;
      } else {
        System.out.println("\n" + GOLD + 
                           "╔══════════════════════════════════════╗");
        System.out.println("║             B I N G O !              ║");
        System.out.println("║             Game Over!               ║");
        System.out.println("║        The winner is User " + currentUser + "!         ║");
        System.out.println("╚══════════════════════════════════════╝" + RESET);
        break; // Exit while loop if the game is over
      }
      
      // Update variables for the next round
      round += 1;
      currentUser = (currentUser == 'A') ? 'B' : 'A';
    }

    // Close the Scanner object and release system resources associated with it
    scanner.close();

  }
}
