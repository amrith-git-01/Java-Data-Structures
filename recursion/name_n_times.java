package recursion;

import java.util.Scanner;

public class name_n_times {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the name: ");
    String name = scanner.nextLine();
    System.out.println("Enter the number of times: ");
    int n = scanner.nextInt();
    printName(name, 1, n);
    scanner.close();
  }

  static int printName(String name,int i, int n){
    if(i>n){
      return 0;
    }
    System.out.println(name);
    return printName(name, i+1, n);
  }
}
