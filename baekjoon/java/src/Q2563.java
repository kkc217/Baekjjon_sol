import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] matrix = new int[100][100];

        for (int i = 0; i < n; i++) {
            int[] row = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int x = 0; x < 10; x++) {
                for (int y = 0; y < 10; y++) {
                    matrix[row[0] + x][row[1] + y] = 1;
                }
            }
        }

        int result = 0;
        for (int x = 0; x < 100; x++) {
            for (int y = 0; y < 100; y++) {
                if (matrix[x][y] == 1) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}
