import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long result = 1;
        long current = 2;
        boolean toggle;

        while (a >= current && b >= current) {
            toggle = false;
            if (a % current == 0) {
                a /= current;
                result *= current;
                toggle = true;
            }
            if (b % current == 0) {
                b /= current;
                if (!toggle) result *= current;
                toggle = true;
            }

            if (!toggle) current++;
        }

        result *= (a * b);

        System.out.println(result);
    }
}
