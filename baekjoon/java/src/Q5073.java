import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q5073 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[3];
        nums[0] = Integer.parseInt(st.nextToken());
        nums[1] = Integer.parseInt(st.nextToken());
        nums[2] = Integer.parseInt(st.nextToken());

        while (nums[0] != 0 && nums[1] != 0 && nums[2] != 0) {
            Arrays.sort(nums);

            if (nums[2] >= nums[0] + nums[1])
                bw.write("Invalid\n");
            else if (nums[0] == nums[1] && nums[1] == nums[2])
                bw.write("Equilateral\n");
            else if (nums[0] != nums[1] && nums[0] != nums[2] && nums[1] != nums[2])
                bw.write("Scalene\n");
            else
                bw.write("Isosceles\n");

            st = new StringTokenizer(br.readLine());
            nums[0] = Integer.parseInt(st.nextToken());
            nums[1] = Integer.parseInt(st.nextToken());
            nums[2] = Integer.parseInt(st.nextToken());
        }

        bw.flush();
    }

}
