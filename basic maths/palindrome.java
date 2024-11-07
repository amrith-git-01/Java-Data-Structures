import java.util.Scanner;

public class palindrome {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num = scanner.nextInt();
    int temp = num;
    int rev = 0;
    while (temp > 0) {
      int lastDigit = temp % 10;
      rev = rev * 10 + lastDigit;
      temp /= 10;
    }
    System.out.println(num == rev);
    scanner.close();
  }
}
