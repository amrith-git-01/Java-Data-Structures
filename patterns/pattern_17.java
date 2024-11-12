import java.util.Scanner;

public class pattern_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            // space
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            // chars
            int char_ = 65;
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print((char) char_);
                if (j < breakpoint)
                    char_++;
                else
                    char_--;
            }

            // space
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
