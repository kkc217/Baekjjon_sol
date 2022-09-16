import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String functions = br.readLine();

            int n = Integer.parseInt(br.readLine());
            String input = br.readLine();
            String[] nums = input.substring(1, input.length() - 1).split(",");

            Deque deque = new ArrayDeque();
            if (n != 0) {
                for (String num : nums) {
                    deque.addLast(Integer.parseInt(num));
                }
            }

            boolean reversed = false;
            int cnt = 0;
            for (int j = 0; j < functions.length(); j++) {
                if (Objects.equals(functions.charAt(j), 'R')) {
                    reversed = !reversed;
                } else {
                    cnt++;
                    if (deque.size() == 0) {
                        break;
                    }

                    if (reversed) {
                        deque.pollLast();
                    } else {
                        deque.pollFirst();
                    }
                }
            }

            StringBuilder result = new StringBuilder();
            if (cnt > n) {
                System.out.println("error");
                continue;
            }
            if (reversed) {
                while (deque.size() > 1) {
                    result.append(deque.pollLast()).append(",");
                }
            } else {
                while (deque.size() > 1) {
                    result.append(deque.pollFirst()).append(",");
                }
            }

            if (!deque.isEmpty()) result.append(deque.pollFirst());
            System.out.println("[" + result + "]");
        }
    }
}
