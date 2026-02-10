package ekkelthemestudy.generictasks;

import ekkelthemestudy.generictasks.graph.Graph;
import ekkelthemestudy.generictasks.graph.GraphBuilder;
import ekkelthemestudy.generictasks.searchingraphs.recursion.ConnectedComponent;

import java.util.LinkedList;

public class GraphConnectedTest {
    public static void main(String[] args) {
        GraphBuilder gb = new GraphBuilder();
        //создание связного графа
        Graph<Integer> G1 = gb.buildIntGraph("src/resources/waysG.txt");
        //создание несвязного графа
        Graph<Integer> G2 = gb.buildIntGraph("src/resources/radiantG.txt");

        //исследование на количество компонент связности
        ConnectedComponent component1 = new ConnectedComponent(G1);
        ConnectedComponent component2 = new ConnectedComponent(G2);

        //вывод результатов
        System.out.println("Количество компонет связности в графе G1 = " +
                component1.getCount());
        System.out.println(new LinkedParts(G1, component1));
        System.out.println("Количество компонент связности в графе G2 = " +
                component2.getCount());
        System.out.println(new LinkedParts(G2, component2));
    }
}

//выводит все компоненты связности для данного графа
class LinkedParts {
    private LinkedList<Integer>[] links;

    <T> LinkedParts(Graph<T> G, ConnectedComponent component) {
        links = new LinkedList[component.getCount()];
        for (int i = 0; i < links.length; i++) links[i] = new LinkedList<>();
        for (int c = 0; c < component.getCount(); c++)
            for (int n = 0; n < G.getVertex(); n++)
                if (component.getId(n) == c)
                    links[c].add(n);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (LinkedList<Integer> c: links){
            sb.append(c.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
