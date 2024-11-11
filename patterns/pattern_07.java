/*
        *    
      * * *
    * * * * *
  * * * * * * *
*/

import java.util.Scanner;

public class pattern_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            // spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        scanner.close();

    }
}
