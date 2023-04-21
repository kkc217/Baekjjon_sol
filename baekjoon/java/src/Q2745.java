import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2745 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String num = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        int result = 0;

        for (int i = 0; i < num.length(); i++) {
            int ch = num.charAt(i);

            if (ch >= 65)
                result += (ch - 55) * Math.pow(b, num.length() - i - 1);
            else
                result += (ch - 48) * Math.pow(b, num.length() - i - 1);
        }

        System.out.println(result);
    }

}
