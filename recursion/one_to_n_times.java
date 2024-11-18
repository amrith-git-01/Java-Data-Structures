package recursion;

import java.util.Scanner;

public class one_to_n_times {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of times:");
    int n = scanner.nextInt();
    printNTimes(1, n);
    scanner.close();
  }

  static int printNTimes(int i, int n) {
    if (i > n) {
      return 0;
    }
    System.out.println(n);
    return printNTimes(i + 1, n);
  }
}
