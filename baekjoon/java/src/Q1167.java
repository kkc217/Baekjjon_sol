import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Q1167 {

    public static ArrayList<Node>[] nodes;

    public static int max = 0;

    public static int maxNode = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int v = Integer.parseInt(br.readLine());

        nodes = new ArrayList[v + 1];

        for (int i = 0; i <= v; i++) {
            nodes[i] = new ArrayList<>();
        }

        for (int i = 0; i < v; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            int m = Integer.parseInt(st.nextToken());

            while (m != -1) {
                nodes[n].add(new Node(m, Integer.parseInt(st.nextToken())));
                m = Integer.parseInt(st.nextToken());
            }
        }

        dfs(1, new HashSet<>(), 0);

        dfs(maxNode, new HashSet<>(), 0);


        System.out.println(max);
    }

    public static void dfs(int v, HashSet<Integer> set, int distance) {
        if (distance > max) {
            max = distance;
            maxNode = v;
        }

        set.add(v);

        for (Node node : nodes[v]) {
            if (!set.contains(node.nextNode)) {
                set.add(node.nextNode);
                dfs(node.nextNode, set, distance + node.distance);
            }
        }
    }

    public static class Node {
        public int nextNode;
        public int distance;

        public Node(int nextNode, int distance) {
            this.nextNode = nextNode;
            this.distance = distance;
        }
    }

}
