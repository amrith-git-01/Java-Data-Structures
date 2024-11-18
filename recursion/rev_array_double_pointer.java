package recursion;

import java.util.Scanner;

public class rev_array_double_pointer {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the size: ");
    int n = scanner.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements: ");
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }
    int[] array = rev(0, n - 1, arr);
    System.out.println("Reversed array: ");
    for (int i = 0; i < n; i++) {
      System.out.println(array[i]);
    }
    scanner.close();
  }

  static int[] rev(int l, int r, int[] arr) {
    if (l >= r) {
      return arr;
    }
    int temp = arr[l];
    arr[l] = arr[r];
    arr[r] = temp;
    return rev(l + 1, r - 1, arr);
  }
}
