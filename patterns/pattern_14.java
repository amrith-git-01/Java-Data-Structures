import java.util.Scanner;

public class pattern_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%c ", j + 65);
            }
            System.out.println();
        }
        scanner.close();
    }
}
