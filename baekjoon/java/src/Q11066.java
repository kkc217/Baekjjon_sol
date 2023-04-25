import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q11066 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());

            int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int[] sum = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                sum[i] = sum[i - 1] + nums[i - 1];
            }


            int[][] matrix = new int[n][n];
            for (int term = 1; term < n; term++) {
                for (int start = 0; start + term < n; start++) {
                    int minSum = Integer.MAX_VALUE;
                    for (int middle = start; middle < start + term; middle++) {
                        if (matrix[start][middle] + matrix[middle + 1][start + term] < minSum)
                            minSum = matrix[start][middle] + matrix[middle + 1][start + term];
                    }
                    matrix[start][start + term] = minSum + sum[start + term + 1] - sum[start];
                }
            }

            sb.append(matrix[0][n - 1]).append("\n");
        }

        System.out.println(sb);
    }

}
