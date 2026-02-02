package ekkelthemestudy.generictasks;

import ekkelthemestudy.generictasks.graph.Graph;
import ekkelthemestudy.generictasks.graph.GraphBuilder;

/**
 * работа графопостроителя
 */

public class GraphDriver2 {
    public static void main(String[] args) {
        Graph<Integer> intGraph = new GraphBuilder().buildIntGraph(
                "src/resources/tinyG.txt"
        );
        System.out.println(intGraph);
        Graph<String> stringGraph = new GraphBuilder().buildStrGraph(
                "src/resources/friendsG.txt"
        );
        System.out.println(stringGraph);
    }
}
