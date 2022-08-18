import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q25305 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        List<Integer> scoreList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            scoreList.add(scanner.nextInt());
        }

        Collections.sort(scoreList, Collections.reverseOrder());

        System.out.println(scoreList.get(k - 1));
    }
}
