package ekkelthemestudy.generictasks;

import ekkelthemestudy.generictasks.graph.Graph;
import ekkelthemestudy.generictasks.graph.GraphBuilder;
import ekkelthemestudy.generictasks.searchingraphs.cycle.DepthCycleSearch;
import ekkelthemestudy.generictasks.searchingraphs.recursion.DepthFirstSearch;

public class TestCycleSearch2 {
    public static void main(String[] args) {
        Graph<Integer> G = new GraphBuilder().buildIntGraph(
                "src/resources/waysG.txt"
        );

        DepthCycleSearch search = new DepthCycleSearch(G, 9);
        System.out.println(search.metVertexes());

        DepthFirstSearch search1 = new DepthFirstSearch(G, 9);
        System.out.println(search1.metVertexes());
    }
}
