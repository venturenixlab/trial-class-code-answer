package day1;

import java.util.Scanner;

public class LabScanner {
  public static void main(String[] args) {
    System.out.print("Please input:");
    Scanner input = new Scanner(System.in);
    int inputInt = input.nextInt();

    System.out.println("input=" + inputInt);
    input.close();
  }
}
