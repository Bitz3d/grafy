package graph.shortestPath;

import graph.graphCreator.GraphCreator;
import graph.graphCreator.Node;

import java.util.Map;
import java.util.Set;

class ShortestPath {
    public static void main(String[] args) {
        String[][] edges = {
                {"w", "x"},
                {"x", "y"},
                {"z", "y"},
                {"s", "z"},
                {"s", "v"},
                {"w", "v"}
        };
        Map<Node, Set<String>> graph = GraphCreator.createGraph(edges);
        System.out.println(ShortestPathImpl.shortestPath(graph, "x", "v"));
    }
}
