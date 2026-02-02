package ekkelthemestudy.generictasks.graph;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GraphBuilder {
    private final String keyWord = "END";

    public Graph<Integer> buildIntGraph(String graphFile) {
        Graph<Integer> graph;
        try (BufferedReader reader = new BufferedReader(new FileReader(graphFile))) {
            String s = reader.readLine();
            graph = new Graph<>(Integer.parseInt(s));
            while (!(s = reader.readLine()).equals(keyWord)) {
                String[] nodes = s.split("\\s");
                graph.addAdj(Integer.parseInt(nodes[0]), Integer.parseInt(nodes[1]));
            }
            int i = 0;
            while ((s = reader.readLine()) != null) {
                graph.get(i++).mainNode.setItem(Integer.parseInt(s));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return graph;
    }

    public Graph<String> buildStrGraph(String graphFile) {
        Graph<String> graph;
        try (BufferedReader reader = new BufferedReader(new FileReader(graphFile))) {
            String s = reader.readLine();
            graph = new Graph<>(Integer.parseInt(s));
            while (!(s = reader.readLine()).equals(keyWord)) {
                String[] nodes = s.split("\\s");
                graph.addAdj(Integer.parseInt(nodes[0]), Integer.parseInt(nodes[1]));
            }
            int i = 0;
            while ((s = reader.readLine()) != null) {
                graph.get(i++).mainNode.setItem(s);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return graph;
    }

    public Graph<Double> buildDoubleGraph(String graphFile) {
        Graph<Double> graph;
        try (BufferedReader reader = new BufferedReader(new FileReader(graphFile))) {
            String s = reader.readLine();
            graph = new Graph<>(Integer.parseInt(s));
            while (!(s = reader.readLine()).equals(keyWord)) {
                String[] nodes = s.split("\\s");
                graph.addAdj(Integer.parseInt(nodes[0]), Integer.parseInt(nodes[1]));
            }
            int i = 0;
            while ((s = reader.readLine()) != null) {
                graph.get(i++).mainNode.setItem(Double.parseDouble(s));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return graph;
    }
}
