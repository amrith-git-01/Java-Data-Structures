import java.util.Scanner;

public class prime_number {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number:");
    int num = scanner.nextInt();
    int count = 0;
    for (int i = 1; i * i <= num; i++) {
      if (num % i == 0) {
        count++;
        if (num / i != i) {
          count++;
        }
      }
    }
    if (count == 2) {
      System.out.println("Prime number");
    } else {
      System.out.println("Not Prime number");
    }
    scanner.close();
  }
}
