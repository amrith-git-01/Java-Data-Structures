package recursion;
import java.util.Scanner;

public class backtracking_1 {
  public static void main(String[] args){
    Scanner scanner= new Scanner(System.in);
    System.out.println("Enter the number of times: ");
    int n=scanner.nextInt();
    printOneToN(n);
    scanner.close();

  }
  static void printOneToN(int n){
    if(n<1){
      return;
    }
    printOneToN(n-1);
    System.out.println(n);
  }
}
