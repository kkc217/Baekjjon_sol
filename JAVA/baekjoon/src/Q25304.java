import java.util.Objects;
import java.util.Scanner;

public class Q25304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = scanner.nextInt();
        int n = scanner.nextInt();

        int result = 0;
        for (int i = 0; i < n; i++) {
            result += scanner.nextInt() * scanner.nextInt();
        }

        if (Objects.equals(total, result)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
