import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1300 {

    public static int n;
    public static int k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());

        int left = 1;
        int right = k;

        while (left < right) {
            int middle = (left + right) / 2;
            int count = 0;

            for (int i = 1; i <= n; i++) {
                count += Math.min(n, middle / i);
            }

            if (count < k)
                left = middle + 1;
            else
                right = middle;
        }

        System.out.println(right);
    }

}
