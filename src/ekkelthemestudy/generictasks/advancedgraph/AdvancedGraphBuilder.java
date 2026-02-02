package ekkelthemestudy.generictasks.advancedgraph;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AdvancedGraphBuilder {
    private String keyWord = "END";

    public AdvancedGraph<String> build(String graphFile) {
        AdvancedGraph<String> graph = null;
        try(BufferedReader reader = new BufferedReader(
                new FileReader(graphFile))) {
            String s = reader.readLine();
            graph = new AdvancedGraph<>(Integer.parseInt(s));
            while (!(s = reader.readLine()).equals(keyWord)) {
                String[] tmp = s.split("\\s");
                if (tmp[2].equals("string"))
                    graph.addEdge(Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1]),
                            tmp[3]);
                else if (tmp[2].equals("integer"))
                    graph.addEdge(Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1]),
                            Integer.parseInt(tmp[3]));
                else if (tmp[2].equals("double"))
                    graph.addEdge(Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1]),
                            Double.parseDouble(tmp[3]));
            }
            int i = 0;
            while ((s = reader.readLine()) != null)
                graph.setItem(i++, s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return graph;
    }
}
