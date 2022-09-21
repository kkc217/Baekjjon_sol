import java.util.*;

public class Q11725 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 1; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            List<Integer> listA;
            if (map.containsKey(a)) {
                listA = map.get(a);
            } else {
                listA = new ArrayList<>();
            }
            listA.add(b);
            map.put(a, listA);

            List<Integer> listB;
            if (map.containsKey(b)) {
                listB = map.get(b);
            } else {
                listB = new ArrayList<>();
            }
            listB.add(a);
            map.put(b, listB);
        }

        int[] result = new int[n + 1];
        result[1] = 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        while (!queue.isEmpty()) {
            int peek = queue.poll();
            for (int i : map.get(peek)) {
                if (result[i] == 0) {
                    queue.add(i);
                    result[i] = peek;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j : map.get(i)) {
                if (result[j] == 0) {
                    result[j] = i;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            System.out.println(result[i]);
        }
    }
}
