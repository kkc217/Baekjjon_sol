import java.util.HashMap;
import java.util.Scanner;

public class Q14425 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(scanner.next(), 0);
        }

        int result = 0;
        for (int i = 0; i < m; i++) {
            if (map.containsKey(scanner.next())) {
                result++;
            }
        }

        System.out.println(result);
    }
}
