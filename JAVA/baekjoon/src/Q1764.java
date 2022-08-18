import java.util.*;

public class Q1764 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(scanner.next(), 0);
        }

        List<String> results = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String input = scanner.next();
            if (map.containsKey(input)) {
                results.add(input);
            }
        }

        Collections.sort(results);
        System.out.println(results.size());
        for (String s : results) {
            System.out.println(s);
        }
    }
}