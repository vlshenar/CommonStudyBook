package ekkelthemestudy.generictasks;

import ekkelthemestudy.generictasks.graph.Graph;
import ekkelthemestudy.generictasks.graph.GraphBuilder;
import ekkelthemestudy.generictasks.searchingraphs.cycle.CycleFindingWays;

public class FindingPathDriver2 {
    public static void main(String[] args) {
        Graph<Integer> G = new GraphBuilder().buildIntGraph(
                "src/resources/waysG.txt"
        );

        //cycle edition
        CycleFindingWays finder = new CycleFindingWays(G, 9);

        for (int i = 0; i < G.getVertex(); i++)
             System.out.println(finder.pathTo(i));
    }
}
