package recursion;
import java.util.Scanner;

public class backtracking_2 {
  public static void main(String[] args){
    Scanner scanner= new Scanner(System.in);
    System.out.println("Enter the number of times: ");
    int n=scanner.nextInt();
    printOneToN(1, n);
    scanner.close();

  }
  static void printOneToN(int i, int n){
    if(i>n){
      return;
    }
    printOneToN(i+1, n);
    System.out.println(i);
  }
}

