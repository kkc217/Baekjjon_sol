import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2559 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int max = 0;
        int idx = 0;
        while (idx < k) {
            max += nums[idx++];
        }

        int sum = max;
        while (idx < n) {
            sum += (nums[idx] - nums[idx - k]);
            idx++;

            if (sum > max) {
                max = sum;
            }
        }

        System.out.println(max);
    }

}
