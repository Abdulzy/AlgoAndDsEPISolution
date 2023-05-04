package graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GraphValidTree {

  static List<List<Integer>> adjacencyList = new ArrayList<>();
  static Set<Integer> seen = new HashSet<>();


    public static boolean validTree(int n, int[][] edges) {

      if (edges.length != n - 1) return false;

      for (int i = 0; i < n; i++) {
        adjacencyList.add(new ArrayList<>());
      }
      for (int[] edge : edges) {
        adjacencyList.get(edge[0]).add(edge[1]);
        adjacencyList.get(edge[1]).add(edge[0]);
      }

      return dfs(0, -1) && seen.size() == n;
    }

    public static boolean dfs(int node, int parent) {
      if (seen.contains(node)) return false;
      seen.add(node);
      for (int neighbour : adjacencyList.get(node)) {
        if (parent != neighbour) {
          boolean result = dfs(neighbour, node);
          if (!result) return false;
        }
      }
      return true;
    }

  public static void main(String[] args) {
    System.out.println(validTree(5,new int[][]{{0,1},{0,2},{0,3},{1,4}}));
  }

}
