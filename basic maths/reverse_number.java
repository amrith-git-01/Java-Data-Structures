import java.util.Scanner;

public class reverse_number {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number:");
    int num = scanner.nextInt();
    int rev = 0;
    while (num > 0) {
      int lastDigit = num % 10;
      rev = rev * 10 + lastDigit;
      num = num / 10;
    }
    System.out.println(rev);
    scanner.close();
  }
}
