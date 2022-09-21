import java.util.Scanner;

public class Q24416 {

    public static int count;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        count = 0;
        fib(n);
        System.out.printf(count + " ");

        count = 0;
        fibonacci(n);
        System.out.println(count);
    }

    public static void fib(int n) {
        if (n == 1 || n == 2) {
            count++;
        } else {
            fib(n - 1);
            fib(n - 2);
        }
    }

    public static void fibonacci(int n) {
        for (int i = 3; i <= n; i++) {
            count++;
        }
    }

}
