import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine()) / 4;

        for (int i = 0; i < num; i++) {
            System.out.printf("long ");
        }
        System.out.println("int");
    }
}
