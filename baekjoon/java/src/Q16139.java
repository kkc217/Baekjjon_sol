import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q16139 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int q = Integer.parseInt(br.readLine());

        int[][] count = new int[26][s.length()];
        count[s.charAt(0) - 'a'][0] = 1;

        for (int i = 1; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';

            for (int j = 0; j < 26; j++) {
                if (j == idx) {
                    count[j][i] = count[j][i - 1] + 1;
                } else {
                    count[j][i] = count[j][i - 1];
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char a = st.nextToken().charAt(0);
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            if (start == 0) {
                sb.append(count[a - 'a'][end]).append("\n");
            } else {
                sb.append(count[a - 'a'][end] - count[a - 'a'][start - 1]).append("\n");
            }
        }

        System.out.println(sb);
    }

}
