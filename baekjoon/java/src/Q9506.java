import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q9506 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        while (n != -1) {
            Queue<Integer> queue = new LinkedList<>();
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    queue.add(i);
                }
            }
            if (sum == n) {
                sb.append(n).append(" = ");
                while (queue.size() > 1) {
                    sb.append(queue.poll()).append(" + ");
                }
                sb.append(queue.poll()).append("\n");
            } else {
                sb.append(n).append(" is NOT perfect.\n");
            }

            n = Integer.parseInt(br.readLine());
        }

        System.out.println(sb);
    }

}
