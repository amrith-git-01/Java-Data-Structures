package hashing;

import java.util.*;

public class hashmap1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int n = scanner.nextInt();
    int[] arr = new int[n];
    HashMap<Integer, Integer> map = new HashMap<>();
    System.out.println("Enter the elements of the array: ");
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
      if (map.containsKey(arr[i])) {
        map.put(arr[i], map.get(arr[i]) + 1);
      } else {
        map.put(arr[i], 1);
      }
    }
    while (true) {
      System.out.println("Enter the number to find its frequency: ");
      int num = scanner.nextInt();
      System.out.println("The frequency is: " + map.get(num));
      System.out.println("Enter 0 to exit or 1 to continue: ");
      int res = scanner.nextInt();
      if (res == 0) {
        break;
      }
    }
    scanner.close();
  }
}
