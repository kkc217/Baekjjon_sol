import java.util.*;

public class Q1966 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            List<Integer> input = new ArrayList<>();
            List<Integer> inputOrdered = new ArrayList<>();
            Queue<Integer> queue = new LinkedList<>();
            for (int j = 0; j < n; j++) {
                input.add(scanner.nextInt());
                inputOrdered.add(input.get(j));
                queue.add(j);
            }

            inputOrdered.sort(Collections.reverseOrder());

            int count = 0;
            int idx = 0;
            while (idx < n) {
                Integer head = queue.poll();
                if (Objects.equals(input.get(head), inputOrdered.get(idx))) {
                    count++;
                    if (Objects.equals(m, head)) break;
                    idx++;
                } else {
                    queue.add(head);
                }
            }

            System.out.println(count);
        }
    }

}
