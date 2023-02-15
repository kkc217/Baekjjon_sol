import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int x = Integer.parseInt(br.readLine());

        Arrays.sort(nums);

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                int sum = nums[i] + nums[j];
                if (sum == x) {
                    result++;
                    break;
                } else if (sum < x) {
                    break;
                }
            }
        }

        System.out.println(result);
    }
}
