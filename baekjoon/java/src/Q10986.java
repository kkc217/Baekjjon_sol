import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10986 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[] matrix = new long[n];
        long[] modArr = new long[m];

        st = new StringTokenizer(br.readLine());

        matrix[0] = Integer.parseInt(st.nextToken()) % m;
        modArr[(int) matrix[0]]++;
        for (int i = 1; i < n; i++) {
            matrix[i] = (Integer.parseInt(st.nextToken()) + matrix[i - 1]) % m;
            modArr[(int) matrix[i]]++;
        }

        long cnt = modArr[0];
        for (long i : modArr) {
            if (i > 1) {
                cnt += i * (i - 1) / 2;
            }
        }

        System.out.println(cnt);
    }

}