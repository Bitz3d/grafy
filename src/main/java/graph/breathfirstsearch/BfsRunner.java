package graph.breathfirstsearch;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class BfsRunner {
    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("a", Arrays.asList("d", "b"));
        graph.put("b", Arrays.asList("c"));
        graph.put("c", new ArrayList<>());
        graph.put("d", Arrays.asList("e"));
        graph.put("e", Arrays.asList("b"));
        graph.put("f", Arrays.asList("c"));
        Bfs.bfs(graph, "a");
    }
}
