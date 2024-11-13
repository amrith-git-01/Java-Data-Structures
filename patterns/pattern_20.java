import java.util.Scanner;

public class pattern_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            // star
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            // space
            for (int j = 0; j < 2 * (rows - i - 1); j++) {
                System.out.print("  ");
            }
            // star
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = rows - 1; i > 0; i--) {
            // star
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            // space
            for (int j = 0; j < 2 * (rows - i - 1); j++) {
                System.out.print("  ");
            }
            // star
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
