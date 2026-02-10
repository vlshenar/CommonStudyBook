package ekkelthemestudy.generictasks.searchingraphs.cycle;

import ekkelthemestudy.generictasks.graph.Graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * поиск в ширину. Ищет кратчайшие пути до указанной вершины из
 * стартовой. Алгоритм взят у Роберта Седжвика
 */

public class BreadthFirstPath {
    private boolean[] marked;
    private final int[] edges;
    private final int startPoint;

    public <T> BreadthFirstPath(Graph<T> graph, int startPoint) {
        marked = new boolean[graph.getVertex()];
        edges = new int[graph.getVertex()];
        this.startPoint = startPoint;
        bsf(graph, startPoint);
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

    private <T> void bsf(Graph<T> graph, int s) {
        Queue<Integer> queue = new LinkedList<>();  //связный список в качестве очереди
        queue.offer(s);
        while (!queue.isEmpty()) {
            int v = queue.poll();
            for (int w : graph.getAdj(v))
                if (!marked[w]) {
                    edges[w] = v;
                    marked[w] = true;
                    queue.offer(w);
                }
        }
    }
}
