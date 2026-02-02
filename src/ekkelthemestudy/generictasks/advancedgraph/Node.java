package ekkelthemestudy.generictasks.advancedgraph;

import java.util.ArrayList;

//узел или вершина
//не видна за пределами пакета,
//не мыслима в отрыве от графа
class Node {
    /*
     * идентификатор узла может быть использован для
     * получения доступа к объекту item, хранимому в графе
     * по принципу хэш-таблицы
     */
    final int id;
    private ArrayList<Edge> edges;

    Node(int id) {
        this.id = id;
        this.edges = new ArrayList<>();
    }

    void addAdj(Edge edge) {
        edges.add(edge);
    }

    ArrayList<Edge> adjE() {
        return edges;
    }
}
