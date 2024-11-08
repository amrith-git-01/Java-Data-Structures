import java.util.Scanner;

public class armstrong {
  public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num = scanner.nextInt();
    int temp = num;
    int n = 0;
    int digits = (int) String.valueOf(num).length();
    while (temp > 0) {
      int lastDigit = temp % 10;
      n = (int) (n + Math.pow(lastDigit, digits));
      temp = temp / 10;
    }
    if (n == num) {
      System.out.println(num + " is an armstrong number");
    } else {
      System.out.println(num + " is not an armstrong number");
    }
    scanner.close();
  }
}
