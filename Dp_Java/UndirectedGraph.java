import java.util.*;
public class UndirectedGraph {

    static boolean dfs(int node , boolean[] visit, ArrayList<ArrayList<Integer>> graph,int parent)
    {

        visit[node]=true;

        for(int n : graph.get(node))
        {
            if(!visit[n])
            {
                if(dfs(n, visit, graph , node))
                {
                    return true;

                }
            }
           else if(n!=parent)
           {
            return true;
           }
        }
        return false;
    }


    public static void main(String args[])
    {
        int v=5;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i=0;i<v;i++)
        {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(0).add(2);

        graph.get(1).add(4);

      

        boolean[] visit = new boolean[v];

        boolean cycle =false;

        for(int i=0; i<v;i++)
        {
            if(!visit[i])
            {
              if(dfs(i, visit, graph, -1))
              {
                cycle=true;
                break;
              }
            }
    }

    System.out.println(cycle?"found":"not Found");
    }
    
}
