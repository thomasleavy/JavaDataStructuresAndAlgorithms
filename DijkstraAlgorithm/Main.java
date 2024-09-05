
public class Main {
    public static void main(String[] args) {
        int vertices = 6; // no. vertices in graph

        // make graph w/ 6 vertices
        GraphImpl graph = new GraphImpl(vertices);

        // Add edges (source, destination, weight)
        graph.addEdge(0, 1, 10);
        graph.addEdge(1, 2, 5);
        graph.addEdge(2, 3, 20);
        graph.addEdge(2, 4, 1);
        graph.addEdge(3, 4, 2);
        graph.addEdge(3, 5, 1);
        graph.addEdge(4, 5, 3);

        //run algo starting at vertex 0
        DijkstraAlgorithm.dijkstra(graph, 0);
    }
}
