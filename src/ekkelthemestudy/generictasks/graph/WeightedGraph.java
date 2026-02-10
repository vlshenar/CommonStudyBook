package ekkelthemestudy.generictasks.graph;

import java.util.ArrayList;
import java.util.HashMap;

public class WeightedGraph extends ArrayList<WeightedAdjacency> {
    private final int vertexes;
    private int edges = 0;
    private final HashMap<Integer, Double> values;

    public WeightedGraph(int nodes) {
        vertexes = nodes;
        for (int i = 0; i < nodes; i++)
            this.add(new WeightedAdjacency(new Node(i)));
        values = new HashMap<>();
    }

    public void addEdge(int firstNode, int secondNode, double weight) {
        Node tmpNode = this.get(firstNode).mainNode;
        this.get(secondNode).add(tmpNode);
        this.get(secondNode).addWeight(weight);
        tmpNode = this.get(secondNode).mainNode;
        this.get(firstNode).add(tmpNode);
        this.get(firstNode).addWeight(weight);
        edges++;
    }

    //значения узлов: установки и получение
    public void setValue(int node, double value) {
        values.put(node, value);
    }

    public double getValue(int node) {
        return values.get(node);
    }

    //веса ребер
    public double[] getWeights(int node) {
        return this.get(node).getWeights();
    }

    //смежные узлы
    public int[] getAdj(int node) {
        WeightedAdjacency current = this.get(node);
        int[] result = new int[current.size()];
        int i = 0;
        for (Node n: current) result[i++] = n.id;
        return result;
    }

    public int getVertexes() {
        return vertexes;
    }

    public int getEdges() {
        return edges;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("Weighted graph\n");
        for(WeightedAdjacency wa: this) {
            result.append(wa.getData());
            result.append("node's values: ").append(wa.mainNode.id);
            result.append(") ").append(values.get(wa.mainNode.id)).append(" ");
            for (Node n: wa) result.append(n.id).append(") ").append(values.get(n.id)).append(" ");
            result.append("\n");
        }
        return result.toString();
    }
}
