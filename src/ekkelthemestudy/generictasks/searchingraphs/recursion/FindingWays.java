package ekkelthemestudy.generictasks.searchingraphs.recursion;

import ekkelthemestudy.generictasks.graph.Graph;

import java.util.LinkedList;

/*
* построение пути из исходной точки методом
* поиска в глубину.
* рекурсивный алгоритм
*/

public class FindingWays {
    private boolean[] marked;
    private final int startPoint; //исходная вершина
    private int[] edges;

    public <T> FindingWays(Graph<T> G, int s) {
        startPoint = s;
        marked = new boolean[G.getVertex()];
        edges = new int[G.getVertex()];
        router(G, s);
    }

    public boolean hasPathTo(int v) {
        return marked[v];
    }

    public Iterable<Integer> pathTo(int v) {
        if (!hasPathTo(v)) return null;
        LinkedList<Integer> way = new LinkedList<>();
        for (int x = v; x != startPoint; x = edges[x])
            way.addFirst(x);
        way.addFirst(startPoint);
        return way;
    }

    private <T> void router(Graph<T> G, int v) {
        marked[v] = true;
        for (int w: G.getAdj(v))
            if (!marked[w]) {
                edges[w] = v;
                router(G, w);
            }
    }
}
