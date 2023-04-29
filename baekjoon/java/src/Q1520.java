import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1520 {

    public static int[][] matrix;
    public static int[][] dp;
    public static int m, n;
    public static final int[] dx = {-1, 0, 0, 1};
    public static final int[] dy = {0, 1, -1, 0};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        matrix = new int[m + 2][n + 2];
        dp = new int[m + 2][n + 2];

        for (int i = 0; i < m + 2; i++) {
            dp[i][0] = 0;
            dp[i][n + 1] = 0;
        }

        for (int i = 0; i < n + 2; i++) {
            dp[0][i] = 0;
            dp[m + 1][i] = 0;
        }

        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= n; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = -1;
            }
        }

        dfs(1, 1);

        System.out.println(dp[1][1]);
    }

    public static int dfs(int x, int y) {
        if (x == m && y == n) return 1;
        if (dp[x][y] != -1) return dp[x][y];
        dp[x][y] = 0;

        for (int i = 0; i < 4; i++) {
            if (matrix[x + dx[i]][y + dy[i]] < matrix[x][y]) {
                dp[x][y] += dfs(x + dx[i], y + dy[i]);
            }
        }
        return dp[x][y];
    }

}

