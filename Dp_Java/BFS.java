
import java.util.*;

public class BFS {

    public static void bfs(int start, ArrayList<ArrayList<Integer>> g, int v) {

        boolean[] visited = new boolean[v];

        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.add(start);

        while (!q.isEmpty()) {

            int node = q.poll();

            System.out.println(node);

            for (int n : g.get(node)) {

                if (!visited[n]) {

                    visited[n] = true;
                    q.add(n);
                }
            }
        }
    }

    public static void main(String args[]) {

        int v = 5;

        ArrayList<ArrayList<Integer>> g = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            g.add(new ArrayList<>());
        }

        g.get(0).add(1);
        g.get(0).add(2);

        g.get(1).add(3);
        g.get(1).add(4);

        g.get(2).add(4);

        bfs(0, g, v);
    }
}
