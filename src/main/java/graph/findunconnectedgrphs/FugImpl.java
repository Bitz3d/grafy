package graph.findunconnectedgrphs;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FugImpl {
    public static int find(Map<String, List<String>> graph) {
        Set<String> visited = new HashSet<>();
        int counter = 0;
        for (String node : graph.keySet()) {
            if (explore(graph, node, visited)) counter++;
        }
        return counter;
    }

    private static boolean explore(final Map<String, List<String>> graph,
                                   final String node,
                                   final Set<String> visited) {
        if (visited.contains(node)) return false;
        visited.add(node);
        List<String> neighbors = graph.get(node);
        neighbors.forEach(n -> explore(graph, n, visited));
        return true;
    }
}


// a - b
