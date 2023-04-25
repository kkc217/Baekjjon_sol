import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] numArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(numArr);


        int start = 0;
        int end = n - 1;

        int[] minVal = new int[2];
        minVal[0] = numArr[start];
        minVal[1] = numArr[end];
        int min = Integer.MAX_VALUE;
        while (start < end) {
            int sum = numArr[start] + numArr[end];
            if (Math.abs(sum) < min) {
                min = Math.abs(sum);
                minVal[0] = numArr[start];
                minVal[1] = numArr[end];
            }

            if (sum > 0) {
                end--;
            } else {
                start++;
            }
        }

        System.out.println(minVal[0] + " " + minVal[1]);
    }
}
