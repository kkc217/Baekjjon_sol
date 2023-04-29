import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q14215 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] nums = new int[3];
        nums[0] = Integer.parseInt(st.nextToken());
        nums[1] = Integer.parseInt(st.nextToken());
        nums[2] = Integer.parseInt(st.nextToken());

        Arrays.sort(nums);

        int sum = nums[0] + nums[1];

        if (sum > nums[2]) {
            System.out.println(sum + nums[2]);
        } else {
            System.out.println(2 * sum - 1);
        }
    }

}
