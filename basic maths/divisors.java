import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

// public class divisors {
//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//     System.out.println("Enter the number:");
//     int num = scanner.nextInt();
//     for (int i = 1; i <= num; i++) {
//       if (num % i == 0) {
//         System.out.print(i + " ");
//       }
//     }
//     scanner.close();
//   }
// }

//Optimised approach
public class divisors {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();
    System.out.println("Enter the number:");
    int num = scanner.nextInt();
    for (int i = 1; i * i <= num; i++) {
      if (num % i == 0) {
        list.add(i);
        if (i != num / i) {
          list.add(num / i);
        }
      }
    }
    Collections.sort(list);
    for (int i : list) {
      System.out.print(i + " ");
    }
    scanner.close();
  }
}
