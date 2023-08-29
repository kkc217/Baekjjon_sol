import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        int[] gaps = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            gaps[i] = nums[i + 1] - nums[i];
        }
        Arrays.sort(gaps);

        int current = gaps[0];
        int result;
        while (current > 0) {
            result = 0;
            for (int i = 0; i < n - 1; i++) {
                if (gaps[i] % current == 0) {
                    result += gaps[i] / current - 1;
                } else {
                    result = -1;
                    break;
                }
            }
            if (result >= 0) {
                System.out.println(result);
                break;
            }
            current--;
        }
    }
}
