// Program to calculate the factorial of a number
import java.util.Scanner;
public class Main {
    public static long fact(int n) {
        if (n == 0) {
            return 1;
        }
        return (long) n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = in.nextInt();
        in.close();
        long result = fact(n);
        System.out.println(result);
    }
}
