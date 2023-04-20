import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10812 {

    public static int[] baskets;
    public static int[] tmpArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        tmpArr = new int[n + 1];
        baskets = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            baskets[i] = i;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int middle = Integer.parseInt(st.nextToken());

            changeOrder(start, end, middle);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(baskets[i]).append(" ");
        }

        System.out.println(sb);
    }

    public static void changeOrder(int start, int end, int middle) {
        int idx = start;

        for (int i = middle; i <= end; i++) {
            tmpArr[idx++] = baskets[i];
        }

        for (int i = start; i < middle; i++) {
            tmpArr[idx++] = baskets[i];
        }

        for (int i = start; i <= end; i++) {
            baskets[i] = tmpArr[i];
        }
    }
}
