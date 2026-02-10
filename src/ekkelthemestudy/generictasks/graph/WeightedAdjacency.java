package ekkelthemestudy.generictasks.graph;

import java.util.ArrayList;

class WeightedAdjacency extends Adjacency {
    private ArrayList<Double> weights;

    WeightedAdjacency(Node mainNode) {
        super(mainNode);
        weights = new ArrayList<>();
    }

    void addWeight(double w) {
        weights.add(w);
    }

    double[] getWeights() {
        double[] result = new double[weights.size()];
        int i = 0;
        for (double w: weights) result[i++] = w;
        return result;
    }

    String getData() {
        StringBuilder sb = new StringBuilder();
        sb.append(mainNode.id);
        for (int i = 0; i < this.size(); i++) {
            sb.append(" -(").append(weights.get(i));
            sb.append(")-> ").append(this.get(i).id);
        }
        sb.append("\n");
        return sb.toString();
    }
}
