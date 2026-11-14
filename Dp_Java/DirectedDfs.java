
import java.util.*;

public class DirectedDfs {

    static boolean dfs(int node,
                       ArrayList<ArrayList<Integer>> graph,
                       boolean[] visited,
                       boolean[] pathVisit) {

        visited[node] = true;
        pathVisit[node] = true;

        for (int n : graph.get(node)) {

            if (!visited[n]) {

                if (dfs(n, graph, visited, pathVisit)) {
                    return true;
                }
            }
            else if (pathVisit[n]) {
                return true;
            }
        }

        pathVisit[node] = false;

        return false;
    }

    public static void main(String[] args) {

        int v = 4;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(1).add(2);
        graph.get(2).add(1);
        graph.get(2).add(3);

        boolean[] visited = new boolean[v];
        boolean[] pathVisit = new boolean[v];

        boolean cycle = false;

        for (int i = 0; i < v; i++) {

            if (!visited[i]) {

                if (dfs(i, graph, visited, pathVisit)) {
                    cycle = true;
                    break;
                }
            }
        }

        System.out.println(cycle ? "Cycle Found" : "Cycle Not Found");
    }
}
