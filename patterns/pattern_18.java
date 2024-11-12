import java.util.Scanner;

public class pattern_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            for (char ch = (char)('E' - i); ch <= 'E'; ch++) {
                System.out.print((char) ch + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
