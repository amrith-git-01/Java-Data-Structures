import java.util.Scanner;

public class euclidean_algorithm {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int num1 = scanner.nextInt();
    System.out.println("Enter the second number: ");
    int num2 = scanner.nextInt();
    while(num1>0 && num2>0){
      if(num1>num2){
        num1 =num1%num2;
      }
      else{
        num2=num2%num1;
      }
    }
    if(num1==0) System.out.println("The GCD is: "+num2);
    else System.out.println("The GCD is: "+num1);
    scanner.close();
  }
}
