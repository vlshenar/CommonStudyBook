package ekkelthemestudy.generictasks;

import ekkelthemestudy.generictasks.graph.GraphBuilder;
import ekkelthemestudy.generictasks.graph.WeightedGraph;

public class TestWeightedGraph {
    public static void main(String[] args) {
        WeightedGraph graph = new GraphBuilder().wgBuild(
                "src/resources/weightedwaysG.txt"
        );

        System.out.println(graph);
    }
}
