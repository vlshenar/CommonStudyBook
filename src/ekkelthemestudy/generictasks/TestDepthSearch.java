package ekkelthemestudy.generictasks;

import ekkelthemestudy.generictasks.graph.Graph;
import ekkelthemestudy.generictasks.graph.GraphBuilder;
import ekkelthemestudy.generictasks.searchingraphs.recursion.DepthFirstSearch;

public class TestDepthSearch {
    public static void main(String[] args) {
        Graph<Integer> graph = new GraphBuilder().buildIntGraph(
                "src/resources/tinyG.txt"
        );

        //поиск в глубину рекурсивный
        int startPoint = 2;
        DepthFirstSearch search = new DepthFirstSearch(graph, startPoint);
        int interestedPoint = 9;
        System.out.println((search.isMarked(interestedPoint))?interestedPoint + " достижима из "
                + startPoint: interestedPoint + " не достижима из " + startPoint);

        System.out.println(search.metVertexes());
    }
}
