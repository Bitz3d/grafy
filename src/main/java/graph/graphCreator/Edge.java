package graph.graphCreator;

class Edge {
    private int weight;
    private Node source;
    private Node destination;

    public Edge(final int weight, final Node source, final Node destination) {
        this.weight = weight;
        this.source = source;
        this.destination = destination;
    }

    public int getWeight() {
        return weight;
    }

    public Edge setWeight(final int weight) {
        this.weight = weight;
        return this;
    }

    public Node getSource() {
        return source;
    }

    public Edge setSource(final Node source) {
        this.source = source;
        return this;
    }

    public Node getDestination() {
        return destination;
    }

    public Edge setDestination(final Node destination) {
        this.destination = destination;
        return this;
    }
}
