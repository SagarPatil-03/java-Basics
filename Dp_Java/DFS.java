
import java.util.*;

public class DFS {

    public static void dfs(int node, ArrayList<ArrayList<Integer>> g, boolean[] visited)
    {
        visited[node] = true;

        System.out.println(node);

        for(int n : g.get(node))
        {
            if(!visited[n])
            {
                dfs(n, g, visited);
            }
        }
    }

    public static void main(String args[])
    {
        int v = 4;

        ArrayList<ArrayList<Integer>> g = new ArrayList<>();

        for(int i = 0; i < v; i++)
        {
            g.add(new ArrayList<>());
        }

        g.get(0).add(1);
        g.get(1).add(2);
        g.get(2).add(3);

        boolean[] visited = new boolean[v];

        dfs(0, g, visited);
    }
}
