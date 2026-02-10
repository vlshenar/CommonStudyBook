package ekkelthemestudy.generictasks.searchingraphs.cycle;

import ekkelthemestudy.generictasks.graph.Graph;

import java.util.LinkedList;

/*
* построение пути из исходной точки методом поиска в
* глубину с использованием цикла
*/

public class CycleFindingWays {
    private boolean[] marked;
    private final int startPoint; //исходная вершина
    private int[] edges;

    public <T> CycleFindingWays(Graph<T> G, int s) {
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
        LinkedList<Integer> stack = new LinkedList<>();
        stack.add(v);
        edges[v] = v;
        while (!stack.isEmpty()) {
            if (!marked[stack.getFirst()]) {
                marked[stack.getFirst()] = true;
                int currentNode = stack.getFirst();
                for (int w: G.getAdj(currentNode)) {
                    if (!marked[w])
                         edges[w] = currentNode;
                    stack.addFirst(w);
                }
            } else stack.removeFirst();
        }
    }
}
