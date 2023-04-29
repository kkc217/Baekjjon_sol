import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q3015 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Person> stack = new Stack<>();
        long count = 0;


        for (int i = 0; i < n; i++) {
            Person person = new Person(Integer.parseInt(br.readLine()), 1);

            while (!stack.isEmpty() && person.height >= stack.peek().height) {
                Person pop = stack.pop();
                count += pop.sameHeight;

                if (pop.height == person.height)
                    person.sameHeight += pop.sameHeight;
            }

            if (!stack.isEmpty()) count++;

            stack.push(person);
        }

        System.out.println(count);
    }

    public static class Person {
        public int height;
        public int sameHeight;

        public Person(int height, int sameHeight) {
            this.height = height;
            this.sameHeight = sameHeight;
        }
    }

}
