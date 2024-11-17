package recursion;

import java.util.Scanner;

public class fibonacci {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = scanner.nextInt();
    System.out.println(fib(n));
    scanner.close();
  }

  static int fib(int n) {
    if (n <= 1) {
      return n;
    }
    return fib(n - 1) + fib(n - 2);
  }
}
