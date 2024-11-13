import java.util.Scanner;

public class pattern_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        for (int i = 0; i < 2 * rows - 1; i++) {
            for (int j = 0; j < 2 * rows - 1; j++) {
                int top = i;
                int left = j;
                int right = (2 * rows - 2) - j;
                int bottom = (2 * rows - 2) - i;
                System.out.print(rows - (Math.min(Math.min(top, bottom), Math.min(left, right))));
            }
            System.out.println();
        }
        scanner.close();
    }
}
