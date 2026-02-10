package ekkelthemestudy.generictasks.searchingraphs.cycle;

import ekkelthemestudy.generictasks.graph.Graph;

import java.util.LinkedList;

/**
 * поиск в глубину с помощью цикла
 * и связного списка в качестве стека
 */

public class DepthCycleSearch {
    private final boolean[] marked;
    private final StringBuilder metVertexes;
    int count = 0;

    public <T> DepthCycleSearch(Graph<T> graph, int startNode) {
        marked = new boolean[graph.getVertex()];
        metVertexes = new StringBuilder("Посещенные узлы: ");
        search(graph, startNode);
    }

    public boolean isMarked(int node) {
        return marked[node];
    }

    public int getCount() {
        return count;
    }

    public String metVertexes() {
        return metVertexes.toString();
    }

    private <T> void search(Graph<T> graph, int startNode) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.add(startNode);
        while (!stack.isEmpty()) {
            if (!marked[stack.getFirst()]) {
                marked[stack.getFirst()] = true;
                int currentNode = stack.getFirst();
                metVertexes.append(currentNode).append("; ");
                count++;
                for (int i : graph.getAdj(currentNode))
                    stack.addFirst(i);
            } else {
                stack.removeFirst();
            }
        }
    }
}
