import java.util.Scanner;

public class Q14889 {

    static int min = Integer.MAX_VALUE;
    static int n;
    static int[][] matrix;
    static boolean[] visit;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();

        visit = new boolean[n];
        matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        grouping(0, 0);

        System.out.println(min);
    }

    public static void grouping(int count, int current) {
        if ((n / 2) == count) {
            calculate();
            return;
        }
        if (current >= n) {
            return;
        }

        for (int i = current; i < n; i++) {
            visit[i] = true;
            grouping(count + 1, i + 1);
            visit[i] = false;
        }
    }

    public static void calculate() {
        int score = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (visit[i] && visit[j]) {
                    score += matrix[i][j];
                    score += matrix[j][i];
                } else if (!visit[i] && !visit[j]) {
                    score -= matrix[i][j];
                    score -= matrix[j][i];
                }
            }
        }
        score = Math.abs(score);
        if (min > score) {
            min = score;
        }
    }

}
