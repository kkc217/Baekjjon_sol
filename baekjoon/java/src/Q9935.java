import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q9935 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] line = br.readLine().toCharArray();
        char[] bomb = br.readLine().toCharArray();

        Stack<Character> stack = new Stack<>();

        for (char ch : line) {
            stack.push(ch);

            if (stack.size() >= bomb.length) {
                if (isBomb(stack, bomb)) {
                    for (int j = 0; j < bomb.length; j++) {
                        stack.pop();
                    }
                }
            }
        }

        if (stack.size() > 0) {
            StringBuilder sb = new StringBuilder();
            for (char ch : stack) {
                sb.append(ch);
            }
            System.out.println(sb);
        } else {
            System.out.println("FRULA");
        }
    }

    public static boolean isBomb(Stack<Character> stack, char[] bomb) {
        for (int i = 0; i < bomb.length; i++) {
            if (stack.get(stack.size() - bomb.length + i) != bomb[i])
                return false;
        }

        return true;
    }

}
