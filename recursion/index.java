package recursion;

import java.util.Scanner;

public class index {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the rows: ");
    int rows = scanner.nextInt();
    System.out.println("Enter the columns: ");
    int columns = scanner.nextInt();
    int[][] array = new int[rows][columns];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        array[i][j] = scanner.nextInt();
      }
    }
    int rowMax = 0;
    int columnMax = 0;
    for (int i = 0; i < rows; i++) {
      int max = 0;
      for (int j = 0; j < columns; j++) {
        max += array[i][j];
      }
      rowMax = Math.max(rowMax, max);
    }
    for (int j = 0; j < columns; j++) {
      int max = 0;
      for (int i = 0; i < rows; i++) {
        max += array[i][j];
      }
      columnMax = Math.max(columnMax, max);
    }
    System.out.println(rowMax > columnMax ? "Row dominant" : "No");
    scanner.close();
  }
}
