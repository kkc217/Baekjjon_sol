import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q11005 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        Stack<Integer> stack = new Stack<>();
        while (n >= b) {
            stack.push(n % b);
            n /= b;
        }
        stack.push(n);

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            int i = stack.pop();

            if (i >= 10) {
                sb.append((char) (i + 55));
            } else {
                sb.append(i);
            }
        }

        System.out.println(sb);
    }

}
