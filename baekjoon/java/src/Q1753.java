import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1753 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        int k = Integer.parseInt(br.readLine());

        ArrayList<Node>[] nodes = new ArrayList[v + 1];
        int[] distances = new int[v + 1];

        for (int i = 0; i <= v; i++) {
            nodes[i] = new ArrayList<>();
        }

        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[k] = 0;

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            nodes[start].add(new Node(end, weight));
        }

        PriorityQueue<Node> queue = new PriorityQueue<>();
        queue.add(new Node(k, 0));

        boolean[] checked = new boolean[v + 1];
        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (checked[current.nextNode]) continue;

            checked[current.nextNode] = true;

            for (Node node : nodes[current.nextNode]) {
                int nextNode = node.nextNode;

                if (distances[nextNode] > (distances[current.nextNode] + node.weight)) {
                    distances[nextNode] = distances[current.nextNode] + node.weight;

                    queue.add(new Node(nextNode, distances[nextNode]));
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= v; i++) {
            if (distances[i] == Integer.MAX_VALUE)
                sb.append("INF\n");
            else
                sb.append(distances[i]).append("\n");
        }

        System.out.println(sb);
    }

    public static class Node implements Comparable<Node> {

        public int nextNode;

        public int weight;

        @Override
        public int compareTo(Node o) {
            return this.weight - o.weight;
        }

        public Node(int nextNode, int weight) {
            this.nextNode = nextNode;
            this.weight = weight;
        }

    }

}
