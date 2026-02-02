package ekkelthemestudy.generictasks;

import ekkelthemestudy.generictasks.graph.Graph;

public class GraphDriver {
    public static void main(String[] args) {
        Graph<Integer> graph = new Graph<>(5);
        for(int i =0; i < 5; i++) graph.setItem(i, i);
        graph.addAdj(2, 4);
        graph.addAdj(0, 1);
        graph.addAdj(2, 1);
        graph.addAdj(3, 1);
        System.out.println(graph);
        for(Integer i: graph.getAdj(1)) System.out.print(i + " ");
        System.out.println("\n" + graph.getItem(2));
        System.out.println("Vertex = " + graph.getVertex() + " edges = " + graph.getEdges());
        System.out.println(graph.getAdj(1).length);
    }
}
