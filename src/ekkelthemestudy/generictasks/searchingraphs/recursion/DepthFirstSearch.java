package ekkelthemestudy.generictasks.searchingraphs.recursion;

import ekkelthemestudy.generictasks.graph.Graph;

/**
 * поиск в глубину, использующий рекурсию
 */

public class DepthFirstSearch {
    private final boolean[] marked;
    private int count = 0;
    //собирает все посещенные узлы графа
    private final StringBuilder metVertexes;

    public <T> DepthFirstSearch(Graph<T> graph, int startNode) {
        marked = new boolean[graph.getVertex()];
        metVertexes = new StringBuilder("Достигнутые узлы: ");
        search(graph, startNode);
    }

    public boolean isMarked(int v) {
        return marked[v];
    }

    public int getCount() {
        return count;
    }

    //возвращает в строке список всех посещенных узлов
    public String metVertexes() {
        return metVertexes.toString();
    }

    private <T> void search(Graph<T> graph, int v) {
        marked[v] = true;
        count++;
        metVertexes.append(v).append(": ");
        metVertexes.append(graph.getItem(v)).append("; ");
        for (int w: graph.getAdj(v)) if (!marked[w]) search(graph, w);
    }
}
