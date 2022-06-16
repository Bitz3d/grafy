package graph.deepfirstsearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class DfsRunner {
    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("a", Arrays.asList("d", "b"));
        graph.put("b", Arrays.asList("c"));
        graph.put("c", new ArrayList<>());
        graph.put("d", Arrays.asList("e"));
        graph.put("e", Arrays.asList("b"));
        graph.put("f", Arrays.asList("c"));

        Dfs.deepFirstSearch(graph, "a");

        Map<String, List<String>> graph1 = new HashMap<>();
        graph1.put("a", Arrays.asList("b", "d"));
        graph1.put("b", Arrays.asList("c"));
        graph1.put("c", new ArrayList<>());
        graph1.put("d", Arrays.asList("e"));
        graph1.put("e", Arrays.asList("b"));
        graph1.put("f", Arrays.asList("c"));

        Dfs.deepFirstSearchRecursion(graph1, "a");

    }
}
