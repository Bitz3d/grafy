package graph.graphCreator;


public class Node {
    private String name;
    private int distance;
    private boolean visited = false;

    public String getName() {
        return name;
    }

    public Node setName(final String name) {
        this.name = name;
        return this;
    }

    public int getDistance() {
        return distance;
    }

    public Node setDistance(final int distance) {
        this.distance = distance;
        return this;
    }

    public boolean isVisited() {
        return visited;
    }

    public Node setVisited(final boolean visited) {
        this.visited = visited;
        return this;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                '}';
    }
}
