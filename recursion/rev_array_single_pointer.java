package recursion;

import java.util.Scanner;

public class rev_array_single_pointer {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the size: ");
    int n = scanner.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements: ");
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }
    int[] array = rev(0, n, arr);
    System.out.println("Reversed array: ");
    for (int i = 0; i < n; i++) {
      System.out.println(array[i]);
    }
    scanner.close();
  }

  static int[] rev(int index, int n, int[] arr) {
    if (index >= n / 2) {
      return arr;
    }
    int temp = arr[index];
    arr[index] = arr[n - index - 1];
    arr[n - index - 1] = temp;
    return rev(index + 1, n, arr);
  }
}
