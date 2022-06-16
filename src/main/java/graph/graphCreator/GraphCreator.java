package graph.graphCreator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GraphCreator {
    public static Map<Node, Set<String>> createGraph(String[][] edges) {
        Map<Node, Set<String>> graph = new HashMap<>();
        for (String[] edge : edges) {
            Node nodeOne = new Node().setName(edge[0]).setDistance(0);
            Node nodeTwo = new Node().setName(edge[1]).setDistance(0);

            addNode(graph, nodeOne, nodeTwo);
            addNode(graph, nodeTwo, nodeOne);

        }
        return graph;
    }

    private static void addNode(final Map<Node, Set<String>> graph, final Node edgeOne, final Node edgeTwo) {

        Node existingNode = graph.keySet()
                .stream()
                .filter(node -> node.getName().equalsIgnoreCase(edgeOne.getName()))
                .findFirst()
                .orElse(null);

        if (existingNode != null) {
            Set<String> naighbors = graph.get(existingNode);
            naighbors.add(edgeTwo.getName());
        } else {
            Set<String> naighbors = new HashSet<>();
            naighbors.add(edgeTwo.getName());
            graph.put(edgeOne, naighbors);
        }
    }
}
