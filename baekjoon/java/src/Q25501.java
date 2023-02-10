import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q25501 {
    public static int recursion(String s, int l, int r, int count){
        if(l >= r) return count + 1;
        else if(s.charAt(l) != s.charAt(r)) return -(count + 1);
        else return recursion(s, l+1, r-1, count + 1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1, 0);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int result = isPalindrome(br.readLine());

            if (result > 0) {
                sb.append(1).append(' ').append(result);
            } else {
                sb.append(0).append(' ').append(-result);
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
