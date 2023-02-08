import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Q1655 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> minQueue = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());

            if (minQueue.size() == maxQueue.size())
                minQueue.offer(input);
            else
                maxQueue.offer(input);

            if (!minQueue.isEmpty() && !maxQueue.isEmpty()) {
                if (minQueue.peek() > maxQueue.peek()) {
                    int tmp = minQueue.poll();
                    minQueue.offer(maxQueue.poll());
                    maxQueue.offer(tmp);
                }
            }

            sb.append(minQueue.peek()).append('\n');
        }

        System.out.println(sb);
    }

}
