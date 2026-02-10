package ekkelthemestudy.generictasks;

import ekkelthemestudy.generictasks.graph.Graph;
import ekkelthemestudy.generictasks.graph.GraphBuilder;
import ekkelthemestudy.generictasks.searchingraphs.cycle.CycleFindingWays;
import ekkelthemestudy.generictasks.searchingraphs.recursion.FindingWays;

//сравнение двух алгоритмов построения пути

public class FindingPathDriver {
    public static void main(String[] args) {
        Graph<Integer> G = new GraphBuilder().buildIntGraph(
                "src/resources/waysG.txt"
        );

        //recursion edition
        FindingWays finder = new FindingWays(G, 9);

        //cycle edition
        CycleFindingWays cycleFinder = new CycleFindingWays(G, 9);

        System.out.println("Recursion edition\t\t\t Cycle edition");
        for (int i = 0; i < G.getVertex(); i++)
                System.out.println("recursion " + finder.pathTo(i) + "\t\t\t\tcycle " + cycleFinder.pathTo(i));

    }
}
