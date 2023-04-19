import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q1504 {

    public static ArrayList<Node>[] nodes;
    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        nodes = new ArrayList[n + 1];

        for (int i = 0; i <= n; i++) {
            nodes[i] = new ArrayList<>();
        }

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            nodes[a].add(new Node(b, c));
            nodes[b].add(new Node(a, c));
        }

        st = new StringTokenizer(br.readLine());
        int u = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int[] startDistance = new int[n + 1];
        dijkstra(1, startDistance);

        int[] endDistance = new int[n + 1];
        dijkstra(n, endDistance);

        int[] middleDistance = new int[n + 1];
        dijkstra(u, middleDistance);


        int result = Math.min(sumDistances(startDistance[u], middleDistance[v], endDistance[v]),
                sumDistances(startDistance[v], middleDistance[v], endDistance[u]));
        if (result == Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(result);
    }

    public static int sumDistances(int a, int b, int c) {
        if (a == Integer.MAX_VALUE ||
        b == Integer.MAX_VALUE||
        c == Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        return a + b + c;
    }

    public static void dijkstra(int start, int[] distance) {
        PriorityQueue<Node> queue = new PriorityQueue<>();
        boolean[] checked = new boolean[n + 1];

        queue.add(new Node(start, 0));

        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[start] =  0;

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            int currentNode = current.nextNode;
            if (checked[currentNode]) continue;
            checked[currentNode] = true;

            for (Node node : nodes[currentNode]) {
                int nextNode = node.nextNode;
                if (distance[nextNode] > distance[currentNode] + node.weight) {
                    distance[nextNode] = distance[currentNode] + node.weight;
                    queue.add(new Node(nextNode, distance[nextNode]));
                }
            }
        }
    }

    static class Node implements Comparable<Node> {

        int nextNode;
        int weight;

        public Node(int nextNode, int weight) {
            this.nextNode = nextNode;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node o) {
            return this.weight - o.weight;
        }

    }

}
