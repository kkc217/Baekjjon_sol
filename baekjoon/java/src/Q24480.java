import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q24480 {

    public static ArrayList<Integer>[] nodes;

    public static int[] visited;

    public static int count;

    public static int n;
    public static int m;
    public static int r;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        nodes = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            nodes[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            nodes[start].add(end);
            nodes[end].add(start);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(nodes[i], Collections.reverseOrder());
        }

        visited = new int[n + 1];
        count = 1;
        dfs(r);

        for (int i = 1; i <= n; i++) {
            bw.write(visited[i] + "\n");
        }
        bw.flush();
    }

    public static void dfs(int node) {
        visited[node] = count++;
        for (int next : nodes[node]) {
            if (visited[next] == 0)
                dfs(next);
        }
    }

}
