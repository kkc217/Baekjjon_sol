import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[][] matrix = new int[input[0]][input[1]];

        for (int i = 0; i < input[0]; i++) {
            matrix[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        for (int i = 0; i < input[0]; i++) {
            int[] row = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            for (int j = 0; j < input[1]; j++) {
                matrix[i][j] += row[j];
                sb.append(matrix[i][j]).append(' ');
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
