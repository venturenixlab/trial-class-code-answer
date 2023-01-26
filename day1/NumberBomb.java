package day1;

import java.util.Random;
import java.util.Scanner;

public class NumberBomb {
  public static void main(String[] arg) {
    // Declare Scanner and int
    Scanner input;
    int inputInt;
    // Given a range of number
    int min = 1;
    int max = 50;
    // Get the bomb number
    Integer bomb = new Random().nextInt(max - min) + min;
    // System.out.println("bomb=" + bomb);

    // Loop to get and compare the user input
    do {
      String numRange = min + " - " + max;
      System.out.print("Input Your Lucky Number (" + numRange + "):");

      // Collect User Input
      input = new Scanner(System.in);
      inputInt = input.nextInt();

      // Invalid input handling
      if (inputInt < min || inputInt > max) {
        System.out.println("Not in range ... Please pick it again.");
        continue;
      }

      // Main Logic: Update the min - max
      if (bomb < inputInt) {
        max = inputInt - 1;
      } else {
        min = inputInt + 1;
      }
    } while (bomb != inputInt);

    // Got the Bomb
    System.out.println("Bomb! 新年快樂!");
    input.close();
  }
}