package ekkelthemestudy.generictasks.graph;

import java.util.ArrayList;

//Список узлов, смежных данной, обозначаемой как
//mainNode
 class Adjacency extends ArrayList<Node> {
    final Node mainNode;

     Adjacency(Node mainNode) {
        this.mainNode = mainNode;
    }

    String adjacencyAsSentence() {
         StringBuilder result = new StringBuilder();
         result.append(mainNode.id);
         for(Node n: this) {
             String s = "->" + n.id + ((n.getItem()!=null)?(": " + n.getItem()):"");
             result.append(s);
         }
         result.append(".\n");
         return result.toString();
    }
}
