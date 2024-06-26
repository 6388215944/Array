import java.util.Scanner;

public class file{ // Class name should reflect its purpose

    public static void inputMatrix(int[][] arr, int row, int col) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Enter element at (%d, %d): ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();

        System.out.println("Enter the number of columns:");
        int col = sc.nextInt();

        int[][] arr = new int[row][col]; // Create the array in main

        inputMatrix(arr, row, col); // Call the method to fill the array

        System.out.println("Print matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Newline after each row
        }
    }
}
