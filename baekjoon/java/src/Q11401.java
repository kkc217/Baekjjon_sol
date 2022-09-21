import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11401 {

    static long P = 1000000007;

    public static long factorial(long num) {
        long result = 1L;

        while (0 < num) {
            result = (result * num) % P;
            num--;
        }

        return result;
    }

    public static long pow(long num, long idx) {
        if (1 == idx) return num % P;

        long tmp = pow(num, idx / 2);

        if (0 == idx % 2) return (tmp * tmp) % P;

        return ((tmp * tmp % P) * num % P) % P;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        long n = Long.parseLong(input[0]);
        long k = Long.parseLong(input[1]);

        System.out.println(factorial(n) * pow((factorial(k) * factorial(n - k) % P), P - 2) % P);
    }

}
