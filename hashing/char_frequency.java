package hashing;

import java.util.Scanner;

public class char_frequency {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int n = scanner.nextInt();
    char[] arr = new char[n];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.next().charAt(0);
    }
    int[] hash = new int[26];
    for (int i = 0; i < n; i++) {
      hash[arr[i] - 'a']++;
    }
    while (true) {
      System.out.println("Enter the character to find its frequency: ");
      char ch = scanner.next().charAt(0);
      System.out.println("The frequency is: " + charFreq(hash, ch));
      System.out.println("Enter 0 to exit or 1 to continue: ");
      int res = scanner.nextInt();
      if (res == 0) {
        break;
      }
    }
    scanner.close();
  }

  static int charFreq(int[] hash, char ch) {
    return hash[ch - 'a'];
  }
}
