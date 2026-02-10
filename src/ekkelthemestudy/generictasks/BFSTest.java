package ekkelthemestudy.generictasks;

import ekkelthemestudy.generictasks.graph.Graph;
import ekkelthemestudy.generictasks.graph.GraphBuilder;
import ekkelthemestudy.generictasks.searchingraphs.cycle.BreadthFirstPath;

public class BFSTest {
    public static void main(String[] args) {
        Graph<Integer> G = new GraphBuilder().buildIntGraph(
                "src/resources/waysG.txt"
        );

        BreadthFirstPath finder = new BreadthFirstPath(G, 9);

        for(int i = 0; i < G.getVertex(); i++)
            System.out.println(finder.pathTo(i));
    }
}
