package ekkelthemestudy.generictasks.graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph<T> extends ArrayList<Adjacency> {
    private final int vertex;
    private int edges = 0;
    private final HashMap<Integer, T> items;

    //конструктор
    public Graph(int nodes) {
        vertex = nodes;
        for (int i = 0; i< nodes; i++)
            add(new Adjacency(new Node(i)));
        items = new HashMap<>();
    }

    //сообщает содержимое вершине
    public void setItem(T item, int node) {
        items.put(node, item);
    }

    //возвращает содержимое вершины
    public T getItem(int node) {
        return items.get(node);
    }

    //добавить ребро
    public void addAdj(int firstNode, int secondNode) {
        Node tempNode = this.get(firstNode).mainNode;
        this.get(secondNode).add(tempNode);
        tempNode = this.get(secondNode).mainNode;
        this.get(firstNode).add(tempNode);
        edges++;
    }

    //возвращает количество вершин
    public int getVertex() {
        return vertex;
    }

    //возвращает количество ребер
    public int getEdges() {
        return edges;
    }

    //возвращает все узлы, смежные данному
    public int[] getAdj(int node) {
        Adjacency current = this.get(node);
        int[] result = new int[current.size()];
        int i = 0;
        for (Node n: current) result[i++] = n.id;
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("This is graph\n");
        for (Adjacency a: this) {
            result.append(a.mainNode.id).append(": ");
            result.append(items.get(a.mainNode.id));
            for (Node n: a) {
                result.append(" --> ").append(n.id);
                result.append(": ").append(items.get(n.id));
            }
            result.append("\n");
        }
        return result.toString();
    }
}
