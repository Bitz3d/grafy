package graph.finbiggestilendingraph;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class BiggestIslandImpl {
    public int biggest(Map<String, List<String>> graph) {
        int count = 0;
        for (String node : graph.keySet()) {
            Set<String> visited = new HashSet<>();
            int explore = explore(graph, node, visited);
            if (count < explore) {
                count = explore;
            }
        }
        return count;
    }

    private int explore(final Map<String, List<String>> graph,
                        final String node,
                        final Set<String> visited) {
        if (visited.contains(node)) return 0;
        int counter = 1;
        visited.add(node);
        List<String> neighbors = graph.get(node);

        for (String neighbor : neighbors) {
            counter += explore(graph, neighbor, visited);
        }
        return counter;
    }
    // a <-> b
//    b <-> a
}
