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
                graph.setItem(i++, Integer.parseInt(s));
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
                graph.setItem(s, i++);
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
                graph.setItem(Double.parseDouble(s), i++);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return graph;
    }

    public WeightedGraph wgBuild(String graphFile) {
        WeightedGraph graph;
        try(BufferedReader reader = new BufferedReader(new FileReader(graphFile))) {
            String s = reader.readLine();
            graph = new WeightedGraph(Integer.parseInt(s));
            while(!(s = reader.readLine()).equals(keyWord)) {
                String[] tmp = s.split("\\s");
                graph.addEdge(Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1]),
                        Double.parseDouble(tmp[2]));
            }
            int i = 0;
            while((s = reader.readLine()) != null)
                graph.setValue(i++, Double.parseDouble(s));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return graph;
    }
}
