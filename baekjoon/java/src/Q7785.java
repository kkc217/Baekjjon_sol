import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q7785 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            if ("enter".equals(st.nextToken())) {
                map.put(name, 1);
            } else {
                map.remove(name);
            }
        }

        List<String> names = new ArrayList<>(map.keySet());
        Collections.sort(names, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String s : names) {
            sb.append(s).append("\n");
        }

        System.out.println(sb);
    }

}
