import java.util.*;

public class file { // Class name should follow PascalCase convention

    public static int CalAverage(int a, int b, int c) {
        int average = (a + b + c) / 3;
        System.out.println("Average: " + average);
        return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int average = CalAverage(a, b, c);  // Store the returned average
        System.out.println("The average is: " + average);  // Print using a separate line for clarity
    }
}
