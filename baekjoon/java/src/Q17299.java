import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Q17299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int idx = 1; idx < n; idx++) {
            while (!stack.isEmpty()
                    && map.get(nums[stack.peek()]) < map.get(nums[idx])) {
                nums[stack.pop()] = nums[idx];
            }
            stack.push(idx);
        }

        while (!stack.isEmpty()) {
            nums[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(nums[i]).append(" ");
        }
        System.out.println(sb);
    }
}
