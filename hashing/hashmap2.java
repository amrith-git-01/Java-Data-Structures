package hashing;

import java.util.*;
import java.util.Map.Entry;

public class hashmap2 {
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
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (Entry<Integer, Integer> entry : map.entrySet()) {
      int frequency = entry.getValue();
      if (frequency > max) {
        max = frequency;
      }
      if (frequency < min) {
        min = frequency;
      }
    }
    System.out.println("Min frequency is: " + min);
    System.out.println("Max frequency is: " + max);
    scanner.close();
  }
}
