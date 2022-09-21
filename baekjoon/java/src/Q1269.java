import java.util.HashMap;
import java.util.Scanner;

public class Q1269 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(scanner.nextInt(), 0);
        }

        int cnt = 0;
        for (int i = 0; i < m; i++) {
            if (map.containsKey(scanner.nextInt())) {
                cnt += 2;
            }
        }
        System.out.println(n + m - cnt);
    }
}
