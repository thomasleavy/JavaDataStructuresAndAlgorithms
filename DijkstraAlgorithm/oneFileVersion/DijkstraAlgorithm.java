//this is a condensed version of the other Dijkstra Algorithm, it is not object-oriented. 

package oneFileVersion;

import java.util.*;
public class DijkstraAlgorithm  {
    public static void dijkstra(int[][] graph, int source) {
        int V = graph.length; //number of vertices
        int[] dist = new int[V]; //output array. dist holds shortest distance between source and i
        boolean[] sptSet = new boolean[V]; //sptSet[i] will be true if the i vertext is in shortest path

        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        //distance of the source from itself will always be set at 0
        dist[source] = 0;

        //find the shortest path for vertices
        for (int count = 0; count < V - 1; count++) {
            int u = minDistance(dist, sptSet);

            sptSet[u] = true;

            for (int v = 0; v < V; v++) {
                // Update dist[v] if and only if:
                // 1. It is not in the sptSet,
                // 2. There is an edge from u to v,
                // 3. Total weight of path from source to v through u is smaller than the current value of dist[v].
                if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

    //print constructed distance array
    printSolution(dist, V);
}


//first utility function is needed to find vertex with minimum distance value.
public static int minDistance(int[] dist, boolean[] sptSet) {
    int min = Integer.MAX_VALUE, minIndex = -1;

    for (int v = 0; v < dist.length; v++) {
        if (!sptSet[v] && dist[v] <= min) {
            min = dist[v];
            minIndex = v;
        }
    }

    return minIndex;
}

//second utility function to print constructed distance array
public static void printSolution(int[] dist, int V) {
    System.out.println("Vertex \t Distance from Source");
    for (int i = 0; i < V; i++) {
        System.out.println(i + " \t\t " + dist[i]);
    }
}

//driver method
public static void main(String[] args) {
    // Let us create the example graph.
    // The graph is represented using an adjacency matrix, where
    // graph[i][j] indicates the weight of the edge between vertex i and vertex j.
    // If there's no edge between i and j, graph[i][j] is set to 0.
    int graph[][] = new int[][]{
        {0, 10, 0, 0, 0, 0},
        {10, 0, 5, 0, 0, 0},
        {0, 5, 0, 20, 1, 0},
        {0, 0, 20, 0, 2, 1},
        {0, 0, 1, 2, 0, 3},
        {0, 0, 0, 1, 3, 0}
    };

    DijkstraAlgorithm.dijkstra(graph, 0); // Compute shortest paths from node 0
}
}