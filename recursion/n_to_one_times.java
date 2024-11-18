package recursion;

import java.util.Scanner;

public class n_to_one_times {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = scanner.nextInt();
    printOneToN(n, 1);
    scanner.close();
  }

  static int printOneToN(int n, int i) {
    if (n < i) {
      return 0;
    }
    System.out.println(n);
    return printOneToN(n - 1, i);
  }
}
