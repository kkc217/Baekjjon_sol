import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = -1;
        int[] result = new int[2];
        for (int i = 0; i < 9; i++) {
            int[] row = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < 9; j++) {
                if (max < row[j]) {
                    max = row[j];
                    result[0] = i + 1;
                    result[1] = j + 1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(max).append('\n').append(result[0]).append(" ").append(result[1]);
        System.out.println(sb);
    }
}
