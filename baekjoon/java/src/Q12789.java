import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            queue.add(Integer.parseInt(st.nextToken()));
        }

        int current = 1;
        while (current <= n) {
            if (!queue.isEmpty() && queue.peek() == current) {
                current++;
                queue.poll();
                continue;
            } else if (!stack.isEmpty() && stack.peek() == current) {
                current++;
                stack.pop();
                continue;
            }

            if (queue.isEmpty()) break;
            stack.push(queue.poll());
        }

        if (stack.isEmpty()) System.out.println("Nice");
        else System.out.println("Sad");
    }
}
