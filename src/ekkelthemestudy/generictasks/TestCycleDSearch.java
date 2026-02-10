package ekkelthemestudy.generictasks;

import ekkelthemestudy.generictasks.graph.Graph;
import ekkelthemestudy.generictasks.graph.GraphBuilder;
import ekkelthemestudy.generictasks.searchingraphs.cycle.DepthCycleSearch;

public class TestCycleDSearch {
    public static void main(String[] args) {
        Graph<Integer> graph = new GraphBuilder().buildIntGraph(
                "src/resources/tinyG.txt"
        );

        DepthCycleSearch search = new DepthCycleSearch(graph, 0);

        System.out.println(search.metVertexes());
        System.out.println("достижимость вершины 7 из вершины 2: " +
                (search.isMarked(7)?"да":"нет"));
    }
}
