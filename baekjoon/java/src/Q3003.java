import java.util.Scanner;

public class Q3003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numArray = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < 6; i++) {
            int num = scanner.nextInt();

            System.out.printf((numArray[i] - num) + " ");
        }
    }
}
