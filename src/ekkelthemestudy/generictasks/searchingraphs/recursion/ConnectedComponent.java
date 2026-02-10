package ekkelthemestudy.generictasks.searchingraphs.recursion;

import ekkelthemestudy.generictasks.graph.Graph;

/**
 * нахождение всех компонентов связности графа
 * реализация алгоритма взята из Седжвик Алгоритмы Java
 */

public class ConnectedComponent {
    private boolean[] marked;
    private int[] id;
    private int count = 0;

    public <T> ConnectedComponent(Graph<T> G) {
        marked = new boolean[G.getVertex()];
        id = new int[G.getVertex()];
        for (int s = 0; s < G.getVertex(); s++)
            if (!marked[s]) {
                dfs(G, s);
                count++;
            }
    }

    public boolean isConnected(int v, int w) {
        return id[w] == id[v];
    }

    public int getId(int v) {
        return id[v];
    }

    public int getCount() {
        return count;
    }

    //поиск в глубину
    private <T> void dfs(Graph<T> G, int v) {
        marked[v] = true;
        id[v] = count;
        for (int w : G.getAdj(v))
            if (!marked[w])
                dfs(G, w);
    }
}
