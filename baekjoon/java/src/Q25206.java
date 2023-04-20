import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q25206 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int totalCount = 0;
        float totalScore = 0;
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            float ratio = Float.parseFloat(st.nextToken());
            String scoreStr = st.nextToken();

            double score;
            switch (scoreStr) {
                case "A+" :
                    score = 4.5;
                    break;
                case "A0" :
                    score = 4.0;
                    break;
                case "B+" :
                    score = 3.5;
                    break;
                case "B0" :
                    score = 3.0;
                    break;
                case "C+" :
                    score = 2.5;
                    break;
                case "C0" :
                    score = 2.0;
                    break;
                case "D+" :
                    score = 1.5;
                    break;
                case "D0" :
                    score = 1.0;
                    break;
                case "F" :
                    score = 0.0;
                    break;
                default :
                    score = -1.0;
            };

            if (score < 0) continue;

            totalCount += ratio;
            totalScore += ratio * score;
        }

        System.out.println(totalScore / totalCount);
    }

}
