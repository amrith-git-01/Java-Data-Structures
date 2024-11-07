import java.util.Scanner;

public class count_digits {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int count = 0;
    int num = scanner.nextInt();
    while (num > 0) {
      count++;
      num /= 10;
    }
    System.out.println(count);
    scanner.close();
  }
}
