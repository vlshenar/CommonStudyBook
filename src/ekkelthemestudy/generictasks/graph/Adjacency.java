package ekkelthemestudy.generictasks.graph;

import java.util.ArrayList;

//Список узлов, смежных данной, обозначаемой как
//mainNode
 class Adjacency extends ArrayList<Node> {
    final Node mainNode;

     Adjacency(Node mainNode) {
        this.mainNode = mainNode;
    }

}
