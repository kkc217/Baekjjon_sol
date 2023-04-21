import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1967 {

    public static ArrayList<Node>[] nodes;
    public static int[] distances;
    public static int maxWeight = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        nodes = new ArrayList[n + 1];
        distances = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            nodes[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            nodes[parent].add(new Node(child, weight));
        }

        getDistance(1);

        System.out.println(maxWeight);
    }

    public static int getDistance(int startNode) {
        if (nodes[startNode].size() == 0) {
            return 0;
        }

        if (nodes[startNode].size() > 1) {
            List<Integer> result = new ArrayList<>();

            for (Node nextNode : nodes[startNode]) {
                result.add(getDistance(nextNode.nextNode) + nextNode.weight);
            }
            Collections.sort(result, Collections.reverseOrder());


            if (result.get(0) + result.get(1) > maxWeight) {
                maxWeight = result.get(0) + result.get(1);
            }

            return result.get(0);
        }

        int distance = getDistance(nodes[startNode].get(0).nextNode) + nodes[startNode].get(0).weight;

        if (distance > maxWeight)
            maxWeight = distance;
        return distance;
    }

    public static class Node {
        int nextNode;
        int weight;

        public Node(int nextNode, int weight) {
            this.nextNode = nextNode;
            this.weight = weight;
        }
    }

}
