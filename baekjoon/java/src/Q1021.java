import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        String[] targets = br.readLine().split(" ");

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        int total = 0;
        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(targets[i]);
            int count = 0;
            while (queue.peek() != target) {
                count++;
                queue.add(queue.poll());
            }
            total += Math.min(queue.size() - count, count);
            queue.poll();
        }
        System.out.println(total);
    }
}
