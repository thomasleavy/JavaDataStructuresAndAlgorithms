import java.util.List;
import java.util.PriorityQueue;
import java.util.Arrays;

class DijkstraAlgorithm {

    public static void dijkstra(Graph graph, int source) {
        int V = graph.getVertexCount(); // no. vertices
        int[] dist = new int[V]; //array for storing shortest distance to each vertex
        boolean[] sptSet = new boolean[V]; // True if vertex is in shortest path tree

        // all distances set as infinite
        // sptSet[] is set as false
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0; //distance from source to itself = 0

        //use a priority queue to choose the vertex with min distance
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(source, 0));

        while (!pq.isEmpty()) {
            Node currentNode = pq.poll();
            int u = currentNode.vertex;

            if (sptSet[u]) {
                continue;
            }
            sptSet[u] = true;

            //for loop to go through all neighbours of current node on
            for (Node neighbour : graph.getNeighbours(u)) {
                int v = neighbour.vertex;
                int weight = neighbour.distance;

                //if statement - for if shorter path is found to v
                if (!sptSet[v] && dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.add(new Node(v, dist[v])); //psu the updated distance to priority queue
                }
            }
        }

        //print distances from source to all vertices
        printSolution(dist, V);
    }

    //fuunction used for printing shortest distances to the different vertices
    public static void printSolution(int[] dist, int V) {
        System.out.println("Vertex \t Distance from Source");
        for (int i = 0; i < V; i++) {
            System.out.println(i + " \t\t " + dist[i]);
        }
    }
}
