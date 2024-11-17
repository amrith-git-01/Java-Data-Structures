package recursion;

import java.util.Scanner;

public class functional_sum {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = scanner.nextInt();
    System.out.println(sumFunctional(n));
    scanner.close();
  }

  static int sumFunctional(int n) {
    if (n < 1) {
      return 0;
    }
    return n + sumFunctional(n - 1);
  }
}
