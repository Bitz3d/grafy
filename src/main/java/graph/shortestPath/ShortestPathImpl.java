package graph.shortestPath;

import graph.graphCreator.Node;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class ShortestPathImpl {
    public static int shortestPath(Map<Node, Set<String>> graph, String source, String dest) {
        Queue<Node> queue = new LinkedList<>();

        Node sourceNode = getNodeByName(graph, source);
        Node destNode = getNodeByName(graph, dest);

        queue.offer(sourceNode);
        sourceNode.setVisited(true);

        while (!queue.isEmpty()) {
            Node poll = queue.poll();
            Set<String> neighbors = graph.get(poll);

            if (poll == destNode) {
                return poll.getDistance();
            }

            neighbors.forEach(neighbor -> {
                Node node = getNodeByName(graph, neighbor);
                if (!node.isVisited()) {
                    node.setVisited(true);
                    node.setDistance(poll.getDistance() + 1);
                    queue.offer(node);
                }
            });

        }

        return -1;
    }

    private static Node getNodeByName(final Map<Node, Set<String>> graph, final String source) {
        return graph.keySet()
                .stream()
                .filter(el -> el.getName().equalsIgnoreCase(source))
                .findFirst()
                .orElse(null);
    }
}
