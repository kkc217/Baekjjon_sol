import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1806 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        if (Arrays.stream(nums).sum() < s) {
            System.out.println(0);
        } else {
            int start = 0;
            int end = 0;
            int sum = nums[start];
            int minLength = n;

            while (start <= end) {
                if (sum >= s) {
                    if (end - start + 1 < minLength)
                        minLength = end - start + 1;

                    sum -= nums[start++];
                } else {
                    if (end == n - 1)
                        break;
                    sum += nums[++end];
                }
            }
            System.out.println(minLength);
        }
    }

}
