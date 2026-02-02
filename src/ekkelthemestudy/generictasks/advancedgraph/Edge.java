package ekkelthemestudy.generictasks.advancedgraph;

import java.util.ArrayList;
import java.util.Arrays;

//ребро улучшенного графа, видимо за пределами пакета,
//но создать его экземпляр вне графа нельзя,
//так как в отрыве от графа оно смысла не имеет
public class Edge {
    private String relation;
    private Integer iParameter;
    private Double fParameter;
    private ArrayList<Node> nodes;

    Edge(String relation, Node... nodes) {
        this.relation = relation;
        this.nodes = new ArrayList<>(2);
        this.nodes.addAll(Arrays.asList(nodes));
    }

    Edge(Integer iParameter, Node... nodes) {
        this.iParameter = iParameter;
        this.nodes = new ArrayList<>(2);
        this.nodes.addAll(Arrays.asList(nodes));
    }

    Edge(Double fParameter, Node... nodes) {
        this.fParameter = fParameter;
        this.nodes = new ArrayList<>(2);
        this.nodes.addAll(Arrays.asList(nodes));
    }

    public String getRelation() {
        return relation;
    }

    public Double getFParameter() {
        return fParameter;
    }

    public Integer getIParameter() {
        return iParameter;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public void setIParameter(Integer iParameter) {
        this.iParameter = iParameter;
    }

    public void setFParameter(Double fParameter) {
        this.fParameter = fParameter;
    }

    public Integer[] getNodes(int currentNode) {
        Integer[] nodeNumbers = new Integer[nodes.size() - 1];
        int i = 0;
        for (Node n : nodes) if (n.id != currentNode) nodeNumbers[i++] = n.id;
        return nodeNumbers;
    }

    public String edgeAsString() {
        return " -(" + ((relation != null) ? relation : "") +
                ((iParameter != null) ? (" " + iParameter) : "") +
                ((fParameter != null) ? (" " + fParameter) : "") + ")-> ";
    }
}
