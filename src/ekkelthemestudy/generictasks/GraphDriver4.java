package ekkelthemestudy.generictasks;

import ekkelthemestudy.generictasks.advancedgraph.AdvancedGraph;
import ekkelthemestudy.generictasks.advancedgraph.AdvancedGraphBuilder;

public class GraphDriver4 {
    public static void main(String[] args) {
        AdvancedGraph<String> graph =
                new AdvancedGraphBuilder().build("src/resources/cityesAG.txt");
        System.out.println(graph);
    }
}
