import java.util.HashMap;
import java.util.Scanner;

public class Q11478 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        HashMap<String, Integer> map = new HashMap<>();
        for (int len = 1; len <= input.length(); len++) {
            for (int start = 0; (start + len) <= input.length(); start++) {
                map.put(input.substring(start, start + len), 0);
            }
        }

        System.out.println(map.size());
    }
}
