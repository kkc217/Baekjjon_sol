import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11718 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        while (br.ready()) {
            sb.append(str).append("\n");
            str = br.readLine();
        }
        sb.append(str);

        System.out.println(sb);
    }

}
