package day1;

public class LabInt {
  public static void main(String[] args) {
    int a = 1;
    int b = 2;
    int c = a + b;

    if (c == 3) {
      c = c + 5;
    } else if (c < 3) {
      c = c - 1;
    } else {
      c = c + 1;
    }
    System.out.println("c=" + c);
  }
}
