import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] words = new String[5];

        int max = 0;
        for (int i = 0; i < 5; i++) {
            words[i] = br.readLine();
            max = Math.max(max, words[i].length());
        }

        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (count < max) {
            for (String str : words) {
                if (str.length() > count) {
                    sb.append(str.charAt(count));
                }
            }
            count++;
        }

        System.out.println(sb);
    }

}
