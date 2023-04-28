import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q16928 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<Integer, Integer> ladder = new HashMap<>();
        HashMap<Integer, Integer> snake = new HashMap<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            ladder.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            snake.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        int[] dp = new int[101];
        for (int i = 2; i <= 100; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);

        while (!queue.isEmpty()) {
            int num = queue.poll();
            if (ladder.containsKey(num)) {
                if (dp[ladder.get(num)] > dp[num]) {
                    dp[ladder.get(num)] = dp[num];
                    queue.add(ladder.get(num));
                }
            } else if (snake.containsKey(num)) {
                if (dp[snake.get(num)] > dp[num]) {
                    dp[snake.get(num)] = dp[num];
                    queue.add(snake.get(num));
                }
            } else {
                for (int i = 1; i <= 6; i++) {
                    int next = num + i;
                    if (next > 100) break;
                    if (dp[next] > dp[num] + 1) {
                        dp[next] = dp[num] + 1;
                        queue.add(next);
                    }
                }
            }
        }

        System.out.println(dp[100]);
    }

}
