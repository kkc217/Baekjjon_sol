import java.util.HashMap;
import java.util.Scanner;

public class Q1620 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        HashMap<String, Integer> stringMap = new HashMap<>();
        HashMap<Integer, String> intMap = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            String input = scanner.next();
            stringMap.put(input, i);
            intMap.put(i, input);
        }

        for (int i = 0; i < m; i++) {
            if (scanner.hasNextInt()) {
                System.out.println(intMap.get(scanner.nextInt()));
            } else {
                System.out.println(stringMap.get(scanner.next()));
            }
        }

    }
}
