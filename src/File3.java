import java.util.Scanner;

public class File3 {
    // Method to calculate the nth Fibonacci number
    public static int calculateFibonacci(int n) {
        // Base case: Fibonacci numbers at positions 0 and 1 are 0 and 1, respectively
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        // Recursive case: sum of the previous two Fibonacci numbers
        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of terms:");
        int numOfTerms = scanner.nextInt();

        System.out.println("Fibonacci series:");
        for (int i = 0; i < numOfTerms; i++) {
            System.out.print(calculateFibonacci(i) + " ");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
