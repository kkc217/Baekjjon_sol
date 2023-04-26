import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q1725 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] nums = new int[n + 2];

        int maxHeight = 0;

        for (int i = 1; i <= n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            if (maxHeight < nums[i])
                maxHeight = nums[i];
        }

        int maxVal = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 1; i <= n + 1; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                int topIdx = stack.pop();
                maxVal = Math.max(maxVal, (i - stack.peek() - 1) * nums[topIdx]);
            }
            stack.push(i);
        }

        System.out.println(maxVal);
    }


}
