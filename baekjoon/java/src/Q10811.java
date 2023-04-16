import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10811 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] baskets = new int[n + 1];
        for (int idx = 1; idx <= n; idx++) {
            baskets[idx] = idx;
        }

        for (int idx = 0; idx < m; idx++) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            while (i < j) {
                int tmp = baskets[i];
                baskets[i] = baskets[j];
                baskets[j] = tmp;
                i++;
                j--;
            }
        }

        for (int idx = 1; idx <= n; idx++) {
            System.out.printf("%d ", baskets[idx]);
        }
    }

}
