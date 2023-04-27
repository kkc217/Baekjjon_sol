import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q12015 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        List<Integer> result = new ArrayList<>();

        result.add(0);
        for (int num : nums) {
            if (num > result.get(result.size() - 1)) {
                result.add(num);
            } else if (num < result.get(result.size() - 1)) {
                int left = 0;
                int right = result.size() - 1;
                while (left < right) {
                    int mid = (right + left) / 2;
                    if (result.get(mid) >= num) {
                        right = mid;
                    } else {
                        left = mid + 1;
                    }
                }
                result.set(right, num);
            }
        }

        System.out.println(result.size() - 1);
    }

}
