package day1;

import java.util.Random;

public class LabLoop {
  public static void main(String[] args) {
    int min = 1;
    int max = 10;
    // Get the bomb number
    Integer random = new Random().nextInt(max - min) + min;

    int count = 0;
    String str = "";

    do {
      count++;
      str = str + count;
    } while (count < random);

    System.out.println(str);
  }
}
