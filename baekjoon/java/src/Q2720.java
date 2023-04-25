import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2720 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (; t > 0; t--) {
            int total = Integer.parseInt(br.readLine());

            sb.append(total / 25).append(" ");
            total %= 25;

            sb.append(total / 10).append(" ");
            total %= 10;

            sb.append(total / 5).append(" ");
            total %= 5;

            sb.append(total).append("\n");
        }
        System.out.println(sb);
    }

}
