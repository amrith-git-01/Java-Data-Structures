package recursion;

import java.util.Scanner;

public class palindrome {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the string: ");
    String str = scanner.nextLine();
    System.out.println(isPalindrome(0,str.length(), str));
     scanner.close();
  }

  static boolean isPalindrome(int i, int n, String s) {
    if (i >= n / 2) {
      return true;
    }
    if (s.charAt(i) != s.charAt(n - i - 1)) {
      return false;
    }
    return isPalindrome(i + 1, n, s);
  }
}
