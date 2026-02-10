package ekkelthemestudy.generictasks.advancedgraph;

import java.util.ArrayList;
import java.util.HashMap;

//улучшенный граф, содержит ребра с параметрами
public class AdvancedGraph<T> extends HashMap<Integer, T> {
    private int vertex;
    private final ArrayList<Node> nodes;
    private int edges = 0;

    public AdvancedGraph(int nodes) {
        this.vertex = nodes;
        this.nodes = new ArrayList<>();
        for (int i = 0; i < nodes; i++)
            this.nodes.add(new Node(i));
    }

    public void setItem(int node, T item) {
        this.put(node, item);
    }

    public T getItem(int node) {
        return this.get(node);
    }

    //добавить ребро: параметр - строка
    public void addEdge(int firstNode, int secondNode, String relation) {
        Edge edge = new Edge(relation, nodes.get(firstNode), nodes.get(secondNode));
        nodes.get(firstNode).addAdj(edge);
        nodes.get(secondNode).addAdj(edge);
        edges++;
    }

    //добавить ребро: параметр - целое число
    public void addEdge(int firstNode, int secondNode, Integer iParam) {
        Edge edge = new Edge(iParam, nodes.get(firstNode), nodes.get(secondNode));
        nodes.get(firstNode).addAdj(edge);
        nodes.get(secondNode).addAdj(edge);
        edges++;
    }

    //добавить ребро: параметр - число с плавающей точкой
    public void addEdge(int firstNode, int secondNode, Double fParam) {
        Edge edge = new Edge(fParam, nodes.get(firstNode), nodes.get(secondNode));
        nodes.get(firstNode).addAdj(edge);
        nodes.get(secondNode).addAdj(edge);
        edges++;
    }

    //число узлов
    public int getVertex() {
        return vertex;
    }

    //число ребер
    public int getEdges() {
        return edges;
    }

    //список-массив ребер, смежных данному
    public ArrayList<Edge> adjE(int node) {
        return new ArrayList<>(nodes.get(node).adjE());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("This is advanced graph\n");
        for (Node n : nodes) {
            sb.append(n.id);
            for (Edge e : n.adjE()) {
                sb.append(e.edgeAsString());
                for (int i : e.getNodes(n.id)) {
                    sb.append(i).append(": ");
                    sb.append(this.get(i));
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
