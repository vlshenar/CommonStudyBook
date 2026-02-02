package ekkelthemestudy.generictasks.graph;

class Node {
    final int id;
    private Object item;

    //constructors
    public Node(int id) {
        this.id = id;
        this.item = null;
    }

    Object getItem() {
        return item;
    }

    void setItem(Object item) {
        this.item = item;
    }
}
