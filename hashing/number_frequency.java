package hashing;

import java.util.Scanner;

public class number_frequency {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int n = scanner.nextInt();
    int[] array = new int[n];
    int max = 0;
    System.out.println("Enter the elements of the array: ");
    for (int i = 0; i < n; i++) {
      array[i] = scanner.nextInt();
      max = Math.max(max, array[i]);
    }
    int[] hash = new int[max + 1];
    for (int i = 0; i < n; i++) {
      hash[array[i]]++;
    }
    while (true) {
      System.out.println("Enter the number to find the frequency of its digits: ");
      int num = scanner.nextInt();
      System.out.println("The frequency is: " + digitFreq(hash, num));
      System.out.println("Enter 0 to exit or 1 to continue: ");
      int res = scanner.nextInt();
      if (res == 0) {
        break;
      }
    }
    scanner.close();
  }

  static int digitFreq(int[] hash, int ele) {
    return hash[ele];
  }
}
