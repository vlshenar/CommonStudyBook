package ekkelthemestudy.generictasks;

import ekkelthemestudy.generictasks.advancedgraph.AdvancedGraph;

public class GraphDriver3 {
    public static void main(String[] args) {
        AdvancedGraph<String> graph = new AdvancedGraph<>(4);

        //инициация узлов графа
        graph.setItem(0, "John");
        graph.setItem(1, "Maria");
        graph.setItem(2, "Harry");
        graph.setItem(3, "Kate");

        //добавление ребер-связей
        graph.addEdge(0, 1, "love");
        graph.addEdge(0, 2, "brother");
        graph.addEdge(1, 2, "friends");
        graph.addEdge(1, 3, "friends");

        System.out.println(graph);
        System.out.println(graph.getItem(graph.adjE(1).get(0).getNodes(1)[0]));
    }
}
