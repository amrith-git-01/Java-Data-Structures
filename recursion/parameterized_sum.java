package recursion;

import java.util.Scanner;

public class parameterized_sum {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = scanner.nextInt();
    int sum = 0;
    System.out.println(sumParameterized(n, sum));
    scanner.close();
  }

  static int sumParameterized(int n, int sum) {
    if (n < 1) {
      return sum;
    }
    return sumParameterized(n - 1, sum + n);
  }
}
