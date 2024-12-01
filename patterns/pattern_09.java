/*
     *    
    ***   
   *****  
  ******* 
 *********
  ******* 
   *****  
    ***   
     * 
*/

import java.util.Scanner;

public class pattern_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            // space
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < rows; i++) {
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < 2 * rows - (2 * i + 1); j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
