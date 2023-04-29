import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q10101 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = new int[3];

        for (int i = 0; i < 3; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        if (Arrays.stream(nums).sum() != 180)
            System.out.println("Error");
        else if (nums[0] == 60 && nums[1] == 60 && nums[2] == 60)
            System.out.println("Equilateral");
        else if (nums[0] != nums[1] && nums[0] != nums[2] && nums[1] != nums[2])
            System.out.println("Scalene");
        else
            System.out.println("Isosceles");
    }

}
