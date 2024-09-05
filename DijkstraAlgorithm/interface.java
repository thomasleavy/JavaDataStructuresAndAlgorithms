//interface

import java.util.List;

interface Graph {
    void addEdge(int source, int destination, int weight);
    List<Node> getNeighbours(int vertex);
    int getVertexCount();
}

