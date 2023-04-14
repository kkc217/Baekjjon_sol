import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");

        long result = Long.parseLong(nums[0]) + Long.parseLong(nums[1]) + Long.parseLong(nums[2]);

        System.out.println(result);
    }
}
