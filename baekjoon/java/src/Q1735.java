import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] nums = new int[4];
        nums[0] = Integer.parseInt(st.nextToken());
        nums[1] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        nums[2] = Integer.parseInt(st.nextToken());
        nums[3] = Integer.parseInt(st.nextToken());

        int boonja = nums[0] * nums[3] + nums[1] * nums[2];
        int boonmo = nums[1] * nums[3];

        int current = 2;
        while (boonja >= current && boonmo >= current) {
            if (boonja % current == 0 && boonmo % current == 0) {
                boonja /= current;
                boonmo /= current;
                continue;
            }

            current++;
        }

        System.out.println(boonja + " " + boonmo);
    }
}
