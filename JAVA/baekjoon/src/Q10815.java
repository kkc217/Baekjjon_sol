import java.util.HashMap;
import java.util.Scanner;

public class Q10815 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(scanner.nextInt(), 1);
        }

        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            if (map.containsKey(scanner.nextInt())) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
