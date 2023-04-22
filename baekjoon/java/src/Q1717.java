import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1717 {

    public static int[] group;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        group = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            group[i] = i;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int input = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            a = findParent(a);
            b = findParent(b);

            if (input == 0) {
                if (a < b) {
                    group[b] = a;
                } else {
                    group[a] = b;
                }
            } else {
                if (a == b) {
                    sb.append("YES\n");
                } else {
                    sb.append("NO\n");
                }
            }
        }

        System.out.println(sb);
    }

    public static int findParent(int x) {
        if (group[x] == x)
            return x;

        int parent = findParent(group[x]);
        group[x] = parent;
        return parent;
    }

}
