import java.util.List;
import java.util.ArrayList;

class GraphImpl implements Graph {
    private int vertices;
    private List<List<Node>> adjacencyList;

    public GraphImpl(int vertices) {
        this.vertices = vertices;
        adjacencyList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<Node>());
        }
    }

    @Override
    public void addEdge(int source, int destination, int weight) {
        adjacencyList.get(source).add(new Node(destination, weight));
        adjacencyList.get(destination).add(new Node(source, weight)); // for undirected graph
    }

    @Override
    public List<Node> getNeighbours(int vertex) {
        return adjacencyList.get(vertex); // return neighbours of given vertex
    }

    @Override
    public int getVertexCount() {
        return vertices; // return no. of vertices in graph
    }
}
