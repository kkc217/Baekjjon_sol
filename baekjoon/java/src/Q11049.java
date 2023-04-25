import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11049 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] matrixSize = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            matrixSize[i][0] = Integer.parseInt(st.nextToken());
            matrixSize[i][1] = Integer.parseInt(st.nextToken());
        }

        int[][] dp = new int[n][n];
        for (int term = 1; term < n; term++) {
            for (int start = 0; start + term < n; start++) {
                int min = Integer.MAX_VALUE;
                for (int middle = start; middle < start + term; middle++) {
                    int val = dp[start][middle] + dp[middle + 1][start + term]
                            + matrixSize[start][0] * matrixSize[middle][1] * matrixSize[start + term][1];

                    if (val < min)
                        min = val;
                }
                dp[start][start + term] = min;
            }
        }

        System.out.println(dp[0][n - 1]);
    }

}
